package me.Andurit.GigaTeleport;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

public class Events extends Main implements CommandExecutor {
	
	@EventHandler
	public boolean onCommand(CommandSender sender, Command cmnd, String label, String[] args)
	{		 
		 Player player = (Player) sender;
		 String text = "";
		 
		 if (sender instanceof Player) {
			 player = (Player) sender;
		 }
		 
		 if (cmnd.getName().equalsIgnoreCase("Teleport")) {
			 if player == null {
				 sender.sendMessage(ChatColor.RED+"[GigaTeleport] Tento prikaz moze poslat len hrac");
			 }
			 else
			 {
				 player.teleport(world);
				 sender.sendMessage(ChatColor.RED + "[GigaTeleport] Bol si teleportovany niekam do pice");
			 }
			 return true;
		 }
		 
		 player.sendMessage("Hraci s povolenym FLY modem: " + text);
		 return true;
	} 
	

}
