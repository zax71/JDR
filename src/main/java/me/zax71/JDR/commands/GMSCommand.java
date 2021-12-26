package me.zax71.JDR.commands;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.minestom.server.command.builder.Command;
import net.minestom.server.entity.GameMode;
import net.minestom.server.entity.Player;

public class GMSCommand extends Command {

    public GMSCommand() {
        super("gms", "gamemodeS", "gamemodeSurvival");

        setDefaultExecutor((sender, context) -> {
            sender.sendMessage(Component.text("Changed to Survival mode").color(NamedTextColor.GREEN));

            // Cast sender to a player object
            Player senderPlayer = (Player) sender;

            // Set their gamemode
            senderPlayer.setGameMode(GameMode.SURVIVAL);
        });
    }
}