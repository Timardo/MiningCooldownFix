package net.covenantturtle.miningcooldownfix;

import net.covenantturtle.miningcooldownfix.config.MiningCooldownFixConfig;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;

public class MiningCooldownFix implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("miningcooldownfix");

    @Override
    public void onInitialize() {
        AutoConfig.register(MiningCooldownFixConfig.class, Toml4jConfigSerializer::new);
    }
    
    public static MiningCooldownFixConfig getConfig() {
        return AutoConfig.getConfigHolder(MiningCooldownFixConfig.class).getConfig();
    }
}
