package com.Head8.factory.sharp;

import java.util.Map;

import com.Head8.factory.matcha.ViewEngine;

public class SharpViewEngine implements ViewEngine {

  @Override
  public String render(String viewName, Map<String, Object> context) {
    return "View Rendered By Sharp";
  }

}
