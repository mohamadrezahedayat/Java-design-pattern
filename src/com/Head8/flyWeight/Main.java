package com.Head8.flyWeight;

public class Main {
  public static void main(String[] args) {
    var service = new PointService(new PointIconFactory());
    for (var Point : service.getpoints()) {
      Point.draw();
    }
  }
}
