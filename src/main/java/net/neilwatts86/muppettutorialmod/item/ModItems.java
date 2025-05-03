package net.neilwatts86.muppettutorialmod.item;

import net.minecraft.world.item.Item;
import net.neilwatts86.muppettutorialmod.MuppetTutorialMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MuppetTutorialMod.MOD_ID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.registerItem(
            "bismuth",
            Item::new, // The factory that the properties will be passed into.
            new Item.Properties() // The properties to use.
    );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
