package com.Head8.factory;

import java.util.HashMap;
import java.util.Map;

// import com.Head8.factory.matcha.Controller;
import com.Head8.factory.sharp.SharpController;

// public class ProductsController extends Controller {
public class ProductsController extends SharpController {
  public void listProducts() {
    // get products from database
    Map<String, Object> context = new HashMap<>();
    // context.put(products)
    render("products.html", context);
  }

}
