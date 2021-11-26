package com.Head8.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
  private List<EventHandler> eventHandlers = new ArrayList<>();

  public void AddEventHandler(EventHandler eventHandler) {
    eventHandlers.add(eventHandler);
  }

  protected void notifyEventHandlers() {
    for (EventHandler eventHandler : eventHandlers) {
      eventHandler.handle();
    }
  }

}
