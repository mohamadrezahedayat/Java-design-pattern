package com.Head8.chainOfResponsibilty;

public class Encrypter extends Handler {
  public Encrypter(Handler next) {
    super(next);
  }

  @Override
  public boolean doHandle(HttpRequest request) {
    System.out.println("encryption");
    return false;
  }

}
