package net.syoga78.infinitedurability;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.List;

public class ModUtils {
    public static boolean isUnbreakable(ItemStack stack) {
        @SuppressWarnings("unchecked")
        List<String> unbreakableItems = (List<String>) Config.ITEM_STRINGS.get();
        ResourceLocation registryName = BuiltInRegistries.ITEM.getKey(stack.getItem());
        if (registryName != null) {
            String name = registryName.toString();
            return unbreakableItems.contains(name) && stack.isDamageableItem();  // Только для предметов с прочностью
        }
        return false;
    }
}
