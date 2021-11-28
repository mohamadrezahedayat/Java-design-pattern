package com.Head8.proxy;

public class RealEbook implements Ebook {
  private String fileName;

  public RealEbook(String fileName) {
    this.fileName = fileName;
    load();
  }

  private void load() {
    System.out.println("Loding the book: " + fileName);
  }

  public void show() {
    System.out.println("Showing the ebook " + fileName);
  }

  public String getFileName() {
    return fileName;
  }
}
