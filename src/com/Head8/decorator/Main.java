package com.Head8.decorator;

public class Main {
  public static void main(String[] args) {
    storeCreditCard(new CloudStream());
    storeCreditCard(new EncryptedCloudStream(new CloudStream()));
    storeCreditCard(new CompressedCloudStream(new CloudStream()));
    storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
  }

  public static void storeCreditCard(Stream stream) {
    stream.write("1234-1234-1234-1234");
  }
}
