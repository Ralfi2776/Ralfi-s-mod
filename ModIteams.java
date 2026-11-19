
package de.badeschaf.arsenal;

import de.badeschaf.arsenal.item.MiningScannerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(
            ForgeRegistries.ITEMS,
            ArsenalMod.MOD_ID
        );

    public static final RegistryObject<Item> MINING_SCANNER =
        ITEMS.register("mining_scanner",
            () -> new MiningScannerItem(
                new Item.Properties().stacksTo(1)
            )
        );
}
