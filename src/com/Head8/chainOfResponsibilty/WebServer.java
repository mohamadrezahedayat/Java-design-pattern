package com.Head8.chainOfResponsibilty;

public class WebServer {
  private Handler handler;

  public WebServer(Handler handler) {
    this.handler = handler;
  }

  public void handle(HttpRequest request) {
    handler.handle(request);
  }
}
