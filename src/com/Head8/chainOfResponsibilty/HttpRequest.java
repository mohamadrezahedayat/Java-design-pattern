package com.Head8.chainOfResponsibilty;

public class HttpRequest {
  private String username;
  private String password;

  public HttpRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public String getUsername() {
    return username;
  }

}
