package com.Head8.command;

import com.Head8.command.fx.Button;

public class Main {
  public static void main(String[] args) {
    var service = new CustomerService();
    var command = new AddCustomerCommand(service);
    var button = new Button(command);
    button.click();

    System.out.println("\n\ncomposite command");
    var composite = new CompositeCommand();
    composite.add(new ResizeCommand());
    composite.add(new BlackAndWhiteCommand());
    composite.execute();

  }
}
