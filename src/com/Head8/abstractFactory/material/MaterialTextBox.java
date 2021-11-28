package com.Head8.abstractFactory.material;

import com.Head8.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {

  @Override
  public void render() {
    System.out.println("material text box");
  }

}
