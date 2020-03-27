package net.makiru.spigot.core;

import org.bukkit.command.Command;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.craftbukkit.v1_14_R1.CraftServer;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;
import java.util.Map;

public class Load {

    @SuppressWarnings("unchecked")
    public Load(JavaPlugin plugin) {
        SimpleCommandMap simpleCommandMap = ((CraftServer) plugin.getServer()).getCommandMap();
        try {
            Field field = SimpleCommandMap.class.getDeclaredField("knownCommands");
            field.setAccessible(true);
            final Map<String, Command> knownCommands = (Map<String, Command>) field.get(simpleCommandMap);
            knownCommands.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
