package me.Andurit.GigaTeleport;

import java.util.logging.Logger;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private Logger console = Logger.getLogger("Minecraft");
	
	public void onEnable()	{
		this.console.info("[GigaTeleport] Plugin succesfully activated");
		this.getServer().getPluginManager().registerEvents((Listener) new Events(),this);
		
	}
	public void onDisable()	{
		this.console.info("[GigaTeleport] Plugin succesfully deactivated");
		
	}
}
