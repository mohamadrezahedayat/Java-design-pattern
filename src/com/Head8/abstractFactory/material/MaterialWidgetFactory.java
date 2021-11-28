package com.Head8.abstractFactory.material;

import com.Head8.abstractFactory.Button;
import com.Head8.abstractFactory.TextBox;
import com.Head8.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {

  @Override
  public Button createButton() {
    return new MaterialButton();
  }

  @Override
  public TextBox createTextBox() {
    return new MaterialTextBox();
  }

}
