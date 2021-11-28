package com.Head8.flyWeight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
  private PointIconFactory iconFactory;

  public PointService(PointIconFactory iconFactory) {
    this.iconFactory = iconFactory;
  }

  public List<Point> getpoints() {
    List<Point> points = new ArrayList<>();
    var point = new Point(1, 2, iconFactory.getPointIcon(PointType.CAFE));
    points.add(point);

    return points;
  }
}
