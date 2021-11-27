package com.Head8.visitor;

// Visitor
public interface Operation {
  void apply(HeadingNode heading);

  void apply(AnchorNode anchor);
}
