package com.Head8.adapter;

import com.Head8.adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter {
  private Caramel caramel;

  public CaramelFilter(Caramel caramel) {
    this.caramel = caramel;
  }

  @Override
  public void apply(Image image) {
    caramel.init();
    caramel.render(image);

  }

}
