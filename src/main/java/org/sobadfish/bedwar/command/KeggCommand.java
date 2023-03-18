package org.sobadfish.bedwar.command;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandExecutor;
import cn.nukkit.command.CommandSender;


public class KeggCommand extends Command {
    public KeggCommand(String name) {
        super(name);
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        commandSender.sendMessage("Hello World");
        return false;
    }
}

