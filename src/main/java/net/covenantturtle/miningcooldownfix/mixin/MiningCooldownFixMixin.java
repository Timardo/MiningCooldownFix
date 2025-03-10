package net.covenantturtle.miningcooldownfix.mixin;

import net.covenantturtle.miningcooldownfix.MiningCooldownFix;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ClientPlayerInteractionManager.class)
public abstract class MiningCooldownFixMixin {
    
    @ModifyConstant(method = "updateBlockBreakingProgress", constant = @Constant(intValue = 5))
    private int MiningCooldownFix(int value) {
        return MiningCooldownFix.getConfig().enabled ? MiningCooldownFix.getConfig().miningCooldown : 5;
    }
}
