package com.Head8.observer;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject {
  private List<Observer> observers = new ArrayList<>();

  public void addObsever(Observer observer) {
    observers.add(observer);
  }

  public void removeObsever(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObsevers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }
}
