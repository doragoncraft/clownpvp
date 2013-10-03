package me.Cl0wnslayer.spvp;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.logging.Logger;
import java.util.Random;

public class spvp extends JavaPlugin{
	public final Logger Logger = java.util.logging.Logger.getLogger("Minecraft");
	public static spvp plugin;
	
	@Override
	public void onDisable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.Logger.info(pdfFile.getFullName() + (" Has Been Disabled"));
		
	}
	@Override
	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.Logger.info(pdfFile.getFullName() + " V " + pdfFile.getVersion() + (" Has Been Enabled"));
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		Random object = new Random();
		int numberz;
		
		if(commandLabel.equalsIgnoreCase("lobby")){
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20000000, 14));
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20000000, 4));
			World world = Bukkit.getWorld("world");
			player.sendMessage(ChatColor.AQUA + "Potion Effects Have Been Added!");
			for(int counter = 1; counter <=1;counter++){
				numberz = 1+object.nextInt(6);
				if(numberz == 1){
					Location loc = new Location(world,117,33,71);
					player.teleport(loc);
					player.setBedSpawnLocation(loc);
				}
				if(numberz == 2){
					Location loc = new Location(world,68,33,129);
					player.teleport(loc);
					player.setBedSpawnLocation(loc);
				}
				if(numberz == 3){
					Location loc = new Location(world,69,33,90);
					player.teleport(loc);
					player.setBedSpawnLocation(loc);
				}
				if(numberz == 4){
					Location loc = new Location(world,52,33,65);
					player.teleport(loc);
					player.setBedSpawnLocation(loc);
				}
				if(numberz == 5){
					Location loc = new Location(world,136,33,23);
					player.teleport(loc);
					player.setBedSpawnLocation(loc);
				}
				if(numberz == 6){
					Location loc = new Location(world,118,33,17);
					player.teleport(loc);
				}
			}
			
		}
		return false;
		
	}
}
	