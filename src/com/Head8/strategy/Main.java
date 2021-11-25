package com.Head8.strategy;

public class Main {
  public static void main(String[] args) {
    var imageStorage = new ImageStorage();
    imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
    imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());
  }
}
