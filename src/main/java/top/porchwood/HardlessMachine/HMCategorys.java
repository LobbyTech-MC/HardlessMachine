package top.porchwood.HardlessMachine;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import top.porchwood.HardlessMachine.HMItem.RunningTools.Heads;
import top.porchwood.HardlessMachine.HMItem.RunningTools.Keys;

public class HMCategorys {
    //static Logger logger;
    //private static HMCategorys instance;
    //public static HMCategorys getInstance(){
    //    return instance == null ? instance = new HMCategorys() : instance;
    //}

    //HardlessMachine plugin;
    //private HMCategorys(){
    //    plugin = HardlessMachine.getInstance();
    //    //if(plugin == null) throw new InvalidPluginException();
    //    instance = this;
    //    //categoryInit();
    //}

    public static final NestedItemGroup HM_MAIN_ITEMGROUP =
            new NestedItemGroup(Keys.makeKey("MainItemGroup"), new CustomItemStack(Heads.HM_NULL, "&f轻功科技"));

    public static final SubItemGroup TOOLS =
            new SubItemGroup(Keys.makeKey("Tools"), HM_MAIN_ITEMGROUP, new CustomItemStack(Material.DIAMOND_PICKAXE, "&f轻功 &a工具"));

    public static final SubItemGroup MACHINE =
            new SubItemGroup(Keys.makeKey("Machine"), HM_MAIN_ITEMGROUP, new CustomItemStack(Material.BLAST_FURNACE, "&f轻功 &a机器"));

    public static final SubItemGroup LOGISTICS =
            new SubItemGroup(Keys.makeKey("Logistics"), HM_MAIN_ITEMGROUP, new CustomItemStack(Material.BUCKET, "&f轻功 &a物流"));

    public static final SubItemGroup STORAGE =
            new SubItemGroup(Keys.makeKey("Storage"), HM_MAIN_ITEMGROUP, new CustomItemStack(Material.LIGHT_BLUE_SHULKER_BOX, "&f轻功 &a存储"));
    public static final SubItemGroup TRANSPORTATION =
            new SubItemGroup(Keys.makeKey("Transportation"), HM_MAIN_ITEMGROUP, new CustomItemStack(Material.DARK_OAK_BOAT, "&f轻功 &a交通"));

}
