package com.Head8.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
  private List<Slide> slides = new ArrayList<>();

  public void addSlide(Slide slide) {
    slides.add(slide);
  }

  public void export(Presentationbuilder builder) {
    builder.addSlide(new Slide("copyright"));
    for (Slide slide : slides) {
      builder.addSlide(slide);
    }
  }
}
