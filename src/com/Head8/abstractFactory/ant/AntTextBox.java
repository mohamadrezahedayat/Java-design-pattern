package com.Head8.abstractFactory.ant;

import com.Head8.abstractFactory.TextBox;

public class AntTextBox implements TextBox {

  @Override
  public void render() {
    System.out.println("ant text box");
  }

}
