package com.Head8.factory.sharp;

import com.Head8.factory.matcha.Controller;
import com.Head8.factory.matcha.ViewEngine;

public class SharpController extends Controller {
  @Override
  protected ViewEngine createViewEngine() {
    return new SharpViewEngine();
  }
}
