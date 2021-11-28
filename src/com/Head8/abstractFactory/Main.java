package com.Head8.abstractFactory;

import com.Head8.abstractFactory.app.ContactForm;
import com.Head8.abstractFactory.material.MaterialWidgetFactory;

public class Main {
  public static void main(String[] args) {
    new ContactForm().render(new MaterialWidgetFactory());
  }
}
