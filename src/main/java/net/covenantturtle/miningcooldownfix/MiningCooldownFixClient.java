package net.covenantturtle.miningcooldownfix;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;

public class MiningCooldownFixClient implements ClientModInitializer {
    public static KeyBinding keybind;

    @Override
    public void onInitializeClient() {
        keybind = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.miningcooldownfix.toggle", -1, "Mining Cooldownfix"));
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (keybind.wasPressed()) {
                MiningCooldownFix.getConfig().enabled = !MiningCooldownFix.getConfig().enabled;
            }
        });
    }
}
