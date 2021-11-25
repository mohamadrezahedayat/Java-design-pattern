package com.Head8.observer;

public class Main {
  public static void main(String[] args) {
    var dataSource = new DataSource();
    var sheet1 = new SpreadSheet(dataSource);
    var sheet2 = new SpreadSheet(dataSource);
    var chart = new Chart(dataSource);

    dataSource.addObsever(sheet1);
    dataSource.addObsever(sheet2);
    dataSource.addObsever(chart);

    dataSource.setValue(1);
  }
}
