package net.covenantturtle.miningcooldownfix.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "miningcooldownfix")
public class MiningCooldownFixConfig implements ConfigData {
    @ConfigEntry.Gui.Tooltip
    @Comment("The cooldown in ticks to use")
    public int miningCooldown = 0;
    
    @ConfigEntry.Gui.Tooltip
    @Comment("Whether the mod is enabled")
    public boolean enabled = true;
}
