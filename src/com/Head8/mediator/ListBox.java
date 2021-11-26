package com.Head8.mediator;

public class ListBox extends UIControl {

  private String selection;

  public String getSelection() {
    return selection;
  }

  public void setSelection(String selection) {
    this.selection = selection;
    notifyEventHandlers();
  }
}
