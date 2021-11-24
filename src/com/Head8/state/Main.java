package com.Head8.state;

public class Main {
  public static void main(String[] args) {
    var canvas = new Canvas();
    canvas.setCurrentTool(new SelectionTool());
    canvas.mouseDown();
    canvas.mouseUp();

    System.out.println("\ntool changed...\n");

    canvas.setCurrentTool(new BrushTool());
    canvas.mouseDown();
    canvas.mouseUp();

    System.out.println("\ntool changed...\n");

    canvas.setCurrentTool(new EraserTool());
    canvas.mouseDown();
    canvas.mouseUp();
  }
}
