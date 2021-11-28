package com.Head8.facade;

public class Main {
  public static void main(String[] args) {
    var service = new NotificationService();
    service.send("hello world", "target");
  }
}