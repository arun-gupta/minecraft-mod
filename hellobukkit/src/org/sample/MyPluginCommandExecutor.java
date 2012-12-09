package org.sample;



import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author Arun Gupta
 */
public class MyPluginCommandExecutor implements CommandExecutor {

    private MyPlugin plugin;

    public MyPluginCommandExecutor(MyPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] strings) {
        switch (cmd.getName().toLowerCase()) {
            case "basic":
                System.out.println("Running the basic command");
                return true;
            case "basic2":
                System.out.println("Running the basic2 command");
                if (!(sender instanceof Player)) {
                    sender.sendMessage("This command can only be run by a player.");
                    return false;
                }
                Player player = (Player) sender;
                System.out.format("{0} player running the command", player.getName());
                return true;
            default:
                return false;
        }
    }
}
