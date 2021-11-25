package com.Head8.command.editor;

public interface UndoableCommand extends Command {
  void unexecute();
}
