package com.Head8.abstractFactory.app;

import com.Head8.abstractFactory.WidgetFactory;

public class ContactForm {
  public void render(WidgetFactory factory) {
    factory.createTextBox().render();
    factory.createButton().render();
  }
}
