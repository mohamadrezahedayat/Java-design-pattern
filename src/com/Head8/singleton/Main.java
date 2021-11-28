package com.Head8.singleton;

public class Main {
  public static void main(String[] args) {
    ConfigManager manager = ConfigManager.getInstance();
    manager.set("name", "Hedy");

    ConfigManager other = ConfigManager.getInstance();
    System.out.println(other.get("name"));
  }
}
