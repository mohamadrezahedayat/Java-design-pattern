package com.Head8.strategy;

public class JpegCompressor implements Compressor {

  @Override
  public void compress(String fileName) {
    System.out.println("Compressing using Jpeg");

  }
}
