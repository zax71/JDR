package me.zax71.JDR.commands;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.minestom.server.color.Color;
import net.minestom.server.command.builder.Command;
import net.minestom.server.entity.GameMode;
import net.minestom.server.entity.Player;

public class GMCCommand extends Command {

    public GMCCommand() {
        super("gmc", "gamemodeC", "gamemodeCreative");

        setDefaultExecutor((sender, context) -> {
            sender.sendMessage(Component.text("Changed to Creative mode").color(NamedTextColor.GREEN));

            // Cast sender to a player object
            Player senderPlayer = (Player) sender;

            // Set their gamemode
            senderPlayer.setGameMode(GameMode.CREATIVE);
        });
    }
}
