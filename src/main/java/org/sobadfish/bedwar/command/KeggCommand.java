package org.sobadfish.bedwar.command;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;


public class KeggCommand  extends Command {

    public KeggCommand(String s) {
        super(s);
    }

    public KeggCommand(String s, String s1) {
        super(s, s1);
    }

    public KeggCommand(String s, String s1, String s2) {
        super(s, s1, s2);
    }

    public KeggCommand(String s, String s1, String s2, String[] strings) {
        super(s, s1, s2, strings);
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {
        commandSender.sendMessage("Hello World");
        return false;
    }
}
