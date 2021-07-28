
package net.mcreator.mcmod.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.mcreator.mcmod.McmodModElements;

@McmodModElements.ModElement.Tag
public class KjbFuel extends McmodModElements.ModElement {
	public KjbFuel(McmodModElements instance) {
		super(instance, 3);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Blocks.CHISELED_RED_SANDSTONE, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
