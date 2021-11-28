package com.Head8.bridge;

public class Main {
  public static void main(String[] args) {
    var remoteControl = new RemoteControl(new SonyTV());
    remoteControl.turnOn();
    var remoteControl2 = new AdvancedRemoteControl(new SonyTV());
    remoteControl2.turnOn();
    remoteControl2.setChannel(3);
    var remoteControl3 = new AdvancedRemoteControl(new SamsungTV());
    remoteControl3.turnOn();
  }
}
