package com.Head8.mediator;

public class Button extends UIControl {

  private boolean isEnable;

  public boolean isEnable() {
    return isEnable;
  }

  public void setEnable(boolean isEnable) {
    this.isEnable = isEnable;
    notifyEventHandlers();
  }
}
