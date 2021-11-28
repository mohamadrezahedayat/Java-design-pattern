package com.Head8.builder;

public class MovieBuilder implements Presentationbuilder {
  private Movie movie = new Movie();

  @Override
  public void addSlide(Slide slide) {
    movie.addFrame(slide.getText(), 10);
  }

  public Movie getMovie() {
    return movie;
  }
}
