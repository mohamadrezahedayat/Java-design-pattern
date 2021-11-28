package com.Head8.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
  private Map<PointType, PointIcon> icons = new HashMap<>();

  public PointIcon getPointIcon(PointType type) {
    // key -> value
    // PointType -> PointIcon
    if (!icons.containsKey(type)) {
      var icon = new PointIcon(type, null);
      // hospital.jpg
      // cafe.jpg
      icons.put(type, icon);
    }
    return icons.get(type);
  }

}
