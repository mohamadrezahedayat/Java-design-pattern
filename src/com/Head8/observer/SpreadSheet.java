package com.Head8.observer;

public class SpreadSheet implements Observer {
  private DataSource dataSource;

  public SpreadSheet(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void update() {
    System.out.println("Spreadsheet got notified " + dataSource.getValue());
  }
}
