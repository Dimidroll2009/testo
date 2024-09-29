
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package testo.init;

import testo.TestoMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class TestoModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, TestoMod.MODID);
	public static final RegistryObject<Potion> TESTO_ZLE = REGISTRY.register("testo_zle",
			() -> new Potion(new MobEffectInstance(MobEffects.SATURATION, 3600, 2, false, true), new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 10, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 20, false, true)));
}
