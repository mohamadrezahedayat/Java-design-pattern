package com.Head8.chainOfResponsibilty;

public class Main {
  public static void main(String[] args) {
    // authenticator -> logger -> compressor -> Encryption
    var encrypter = new Encrypter(null);
    var compressor = new Compressor(encrypter);
    var logger = new Logger(compressor);
    var authenticator = new Authenticator(logger);

    var server = new WebServer(authenticator);

    server.handle(new HttpRequest("admin", "1234"));
  }
}
