package tterrag.uhs3.tweaks;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import thermalexpansion.item.TEItems;
import tonius.simplyjetpacks.SimplyJetpacks;
import tterrag.rtc.RecipeAddition;
import tterrag.rtc.RecipeAddition.EventTime;
import tterrag.rtc.RecipeRemoval;
import tterrag.rtc.TweakingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class SJTweaks
{
	@RecipeRemoval(requiredModids="simplyjetpacks", time=EventTime.PLAYER_JOIN)
	public static void removeRecipes()
	{
		TweakingRegistry.markItemForRecipeRemoval(SimplyJetpacks.jetpackTier1.itemID, -1);
		TweakingRegistry.markItemForRecipeRemoval(SimplyJetpacks.jetpackTier2.itemID, -1);
		TweakingRegistry.markItemForRecipeRemoval(SimplyJetpacks.jetpackTier3.itemID, -1);
		TweakingRegistry.markItemForRecipeRemoval(SimplyJetpacks.jetpackTier4.itemID, -1);
	}
	
	@RecipeAddition(requiredModids="simplyjetpacks", time=EventTime.PLAYER_JOIN)
	public static void addRecipes()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SimplyJetpacks.jetpackTier1), 
				"ICI",
				"IPI",
				" T ",
				
				'I', "ingotLead",
				'C', TEItems.capacitorBasic,
				'P', thermalexpansion.item.TEEquipment.armorInvarPlate,
				'T', new ItemStack(SimplyJetpacks.metaItem1, 1, 0)
				));
		
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SimplyJetpacks.jetpackTier2), 
				"ICI",
				"IPI",
				" T ",
				
				'I', "ingotInvar",
				'C', TEItems.capacitorHardened,
				'P', new ItemStack(SimplyJetpacks.jetpackTier1, 1, OreDictionary.WILDCARD_VALUE),
				'T', new ItemStack(SimplyJetpacks.metaItem1, 1, 1)
				));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SimplyJetpacks.jetpackTier3), 
				"ICI",
				"IPI",
				" T ",
				
				'I', "ingotElectrum",
				'C', TEItems.capacitorReinforced,
				'P', new ItemStack(SimplyJetpacks.jetpackTier2, 1, OreDictionary.WILDCARD_VALUE),
				'T', new ItemStack(SimplyJetpacks.metaItem1, 1, 2)
				));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(SimplyJetpacks.jetpackTier4), 
				"ICI",
				"IPI",
				" T ",
				
				'I', "ingotEnderium",
				'C', TEItems.capacitorResonant,
				'P', new ItemStack(SimplyJetpacks.jetpackTier3, 1, OreDictionary.WILDCARD_VALUE),
				'T', new ItemStack(SimplyJetpacks.metaItem1, 1, 3)
				));
	}
}