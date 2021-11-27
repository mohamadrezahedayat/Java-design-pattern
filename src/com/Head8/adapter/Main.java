package com.Head8.adapter;

import com.Head8.adapter.avaFilters.Caramel;

public class Main {
  public static void main(String[] args) {
    var imageView = new ImageView(new Image());
    // imageView.apply(new VividFilter());
    imageView.apply(new CaramelFilter(new Caramel()));
  }
}
