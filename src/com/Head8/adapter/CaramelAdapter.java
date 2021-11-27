package com.Head8.adapter;

import com.Head8.adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {

  @Override
  public void apply(Image image) {
    init();
    render(image);
  }

}
