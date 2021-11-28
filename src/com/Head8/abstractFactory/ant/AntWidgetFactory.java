package com.Head8.abstractFactory.ant;

import com.Head8.abstractFactory.Button;
import com.Head8.abstractFactory.TextBox;
import com.Head8.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {

  @Override
  public Button createButton() {
    return new AntButton();
  }

  @Override
  public TextBox createTextBox() {
    return new AntTextBox();
  }

}
