package com.Head8.builder;

public class PdfDocumentBuilder implements Presentationbuilder {
  private PdfDocument document = new PdfDocument();

  @Override
  public void addSlide(Slide slide) {
    document.addPage(slide.getText());
  }

  public PdfDocument getPdfDocument() {
    return document;
  }
}
