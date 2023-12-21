package com.wolfoverflow.mixin;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ClientPlayerInteractionManager.class)
public abstract class Nobreakdelay {
	@ModifyConstant(method = "updateBlockBreakingProgress", constant = @Constant(intValue = 5))
	private int MiningCooldownFix(int value) {
		return 0;
	}
}