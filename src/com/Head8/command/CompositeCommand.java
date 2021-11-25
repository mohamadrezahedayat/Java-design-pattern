package com.Head8.command;

import java.util.ArrayList;
import java.util.List;

import com.Head8.command.fx.Command;

public class CompositeCommand implements Command {
  private List<Command> commands = new ArrayList<>();

  public void add(Command command) {
    commands.add(command);
  }

  @Override
  public void execute() {
    for (var command : commands) {
      command.execute();
    }
  }

}
