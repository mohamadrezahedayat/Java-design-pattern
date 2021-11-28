package com.Head8.abstractFactory.material;

import com.Head8.abstractFactory.Button;

public class MaterialButton implements Button {

  @Override
  public void render() {
    System.out.println("Material buttom");
  }

}
