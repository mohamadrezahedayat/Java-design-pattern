
package com.Head8.builder;

public class Main {
  public static void main(String[] args) {
    var presentation = new Presentation();
    presentation.addSlide(new Slide("slide 1"));
    presentation.addSlide(new Slide("slide 2"));

    var builder = new PdfDocumentBuilder();
    presentation.export(builder);
    var pdf = builder.getPdfDocument();

    var builder2 = new MovieBuilder();
    presentation.export(builder2);
    var movie = builder2.getMovie();
  }
}
