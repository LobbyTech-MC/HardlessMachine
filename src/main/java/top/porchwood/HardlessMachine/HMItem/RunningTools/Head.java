package top.porchwood.HardlessMachine.HMItem.RunningTools;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Head {
	
	public static final String LIGHT_WORK = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjRhZTU1ZDI5MGZiOGQzOTg2M2IzODU2Y2JmZmRlZTNiOTA2ZDkxNjY3NzVmNDgwMzE2NzU4OWY3NDVhMTg3ZCJ9fX0=";

    public static final String DEFAULT_ROOT_RESOURCES = "https://gitee.com/this_is_a_cat/plugin-heads/raw/master/HardlessMachine/";

    private static String customRootResources;

    public static String getRoot() {
        return customRootResources == null ? DEFAULT_ROOT_RESOURCES : customRootResources;
    }

    public static String getPath(String name) {
        return getRoot() + name + ".png";
    }

    public static String getBase64(String name) {
        String raw = "{\"textures\":{\"SKIN\":{\"url\":\"" + getPath(name) + "\"}}}";
        return Base64.getEncoder().encodeToString(raw.getBytes(StandardCharsets.UTF_8));
    }

    public static String getCustomRootResources() {
        return customRootResources;
    }

    public static void setCustomRootResources(String customRootResources) {
        Head.customRootResources = customRootResources;
    }
}
