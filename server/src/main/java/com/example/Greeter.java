package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /*
  Comment for greet method per Jenkins
 */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
