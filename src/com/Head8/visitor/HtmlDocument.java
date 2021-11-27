package com.Head8.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
  private List<HtmlNode> nodes = new ArrayList<>();

  public void add(HtmlNode node) {
    nodes.add(node);
  }

  public void execute(Operation operation) {
    for (HtmlNode node : nodes) {
      node.execute(operation);
    }
  }
}
