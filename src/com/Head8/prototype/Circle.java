package com.Head8.prototype;

public class Circle implements Component {
  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public void render() {
    System.out.println("rendering a circle");
  }

  @Override
  public Component clone() {
    Circle newCircle = new Circle();
    newCircle.setRadius(radius);
    return newCircle;
  }
}
