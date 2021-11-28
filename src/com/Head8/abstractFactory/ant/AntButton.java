package com.Head8.abstractFactory.ant;

import com.Head8.abstractFactory.Button;

public class AntButton implements Button {

  @Override
  public void render() {
    System.out.println("ant buttom");
  }

}