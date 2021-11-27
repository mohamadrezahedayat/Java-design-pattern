package com.Head8.visitor;

public class HighlightOperation implements Operation {

  @Override
  public void apply(HeadingNode heading) {
    System.out.println("highlght-heading");

  }

  @Override
  public void apply(AnchorNode anchor) {
    System.out.println("highlight-anchor");

  }

}
