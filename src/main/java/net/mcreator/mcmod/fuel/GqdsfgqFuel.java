
package net.mcreator.mcmod.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.mcreator.mcmod.McmodModElements;

@McmodModElements.ModElement.Tag
public class GqdsfgqFuel extends McmodModElements.ModElement {
	public GqdsfgqFuel(McmodModElements instance) {
		super(instance, 1);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Blocks.NOTE_BLOCK, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
