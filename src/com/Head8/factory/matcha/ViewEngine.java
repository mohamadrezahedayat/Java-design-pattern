package com.Head8.factory.matcha;

import java.util.Map;

public interface ViewEngine {
  String render(String viewName, Map<String, Object> context);
}
