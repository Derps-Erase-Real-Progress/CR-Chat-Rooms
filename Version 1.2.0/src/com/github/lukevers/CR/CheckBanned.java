package com.github.lukevers.CR;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class CheckBanned {
	
	public CheckBanned () {
			
			Plugin config = Bukkit.getServer().getPluginManager().getPlugin("CR");

			if (config.getConfig().getString("BANNED.AQUA") == null) {
				config.getConfig().set("BANNED.AQUA", "false");
				}
			if (config.getConfig().getString("BANNED.BLACK") == null) {
				config.getConfig().set("BANNED.BLACK", "false");
				}
			if (config.getConfig().getString("BANNED.BLUE") == null) {
				config.getConfig().set("BANNED.BLUE", "false");
				}
			if (config.getConfig().getString("BANNED.DARK_AQUA") == null) {
				config.getConfig().set("BANNED.DARK_AQUA", "false");
				}
			if (config.getConfig().getString("BANNED.DARK_BLUE") == null) {
				config.getConfig().set("BANNED.DARK_BLUE", "false");
				}
			if (config.getConfig().getString("BANNED.DARK_GRAY") == null) {
				config.getConfig().set("BANNED.DARK_GRAY", "false");
				}
			if (config.getConfig().getString("BANNED.DARK_GREEN") == null) {
				config.getConfig().set("BANNED.DARK_GREEN", "false");
				}
			if (config.getConfig().getString("BANNED.DARK_PURPLE") == null) {
				config.getConfig().set("BANNED.DARK_PURPLE", "false");
				}
			if (config.getConfig().getString("BANNED.DARK_RED") == null) {
				config.getConfig().set("BANNED.DARK_RED", "false");
				}
			if (config.getConfig().getString("BANNED.GOLD") == null) {
				config.getConfig().set("BANNED.GOLD", "false");
				}
			if (config.getConfig().getString("BANNED.GRAY") == null) {
				config.getConfig().set("BANNED.GRAY", "false");
				}
			if (config.getConfig().getString("BANNED.GREEN") == null) {
				config.getConfig().set("BANNED.GREEN", "false");
				}
			if (config.getConfig().getString("BANNED.LIGHT_PURPLE") == null) {
				config.getConfig().set("BANNED.LIGHT_PURPLE", "false");
				}
			if (config.getConfig().getString("BANNED.RED") == null) {
				config.getConfig().set("BANNED.RED", "false");
				}
			if (config.getConfig().getString("BANNED.WHITE") == null) {
				config.getConfig().set("BANNED.WHITE", "false");
				}
			if (config.getConfig().getString("BANNED.YELLOW") == null) {
				config.getConfig().set("BANNED.YELLOW", "false");
				}			
			Bukkit.getServer().getPluginManager().getPlugin("CR").saveConfig();
	
	}//close constructor
	
}//close check banned
