package com.Head8.strategy;

public class BlackAndWhiteFilter implements Filter {

  @Override
  public void apply(String fileNme) {
    System.out.println("Applying Black and White filter");
  }

}
