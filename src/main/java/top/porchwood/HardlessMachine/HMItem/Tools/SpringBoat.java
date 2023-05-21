package top.porchwood.HardlessMachine.HMItem.Tools;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemHandler;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;

public class SpringBoat extends SlimefunItem {

    protected Vector vAddValue = new Vector(0, 1.2, 0);

    public SpringBoat(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        ItemHandler[] handlers = new ItemHandler[]{(ItemUseHandler) this::onRightClick,};
        addItemHandler(handlers);
    }

    public void onRightClick(PlayerRightClickEvent e) {
        Player player = e.getPlayer();
        Material block = player.getWorld().getBlockAt(player.getLocation().add(0, -0.5, 0)).getType();
        if (block == Material.AIR
                || block == Material.WATER
                || block == Material.LAVA) {
            return;
        }
        player.setVelocity(player.getVelocity().add(vAddValue));
    }
}
