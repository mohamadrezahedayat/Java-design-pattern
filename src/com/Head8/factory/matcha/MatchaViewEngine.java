package com.Head8.factory.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine {
  public String render(String viewName, Map<String, Object> context) {
    return "View rendered by Matcha";
  }
}
