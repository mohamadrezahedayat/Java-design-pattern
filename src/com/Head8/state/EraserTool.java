package com.Head8.state;

public class EraserTool implements Tool {
  @Override
  public void mouseDown() {
    System.out.println("eraser icon");
  }

  @Override
  public void mouseUp() {
    System.out.println("erase something");
  }
}