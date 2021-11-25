package com.Head8.iterator;

public interface Iterator<T> {
  boolean hasNext();

  T current();

  void next();
}
