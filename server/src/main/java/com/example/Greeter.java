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
  * @param is some name of the person
  * Returning string
  */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
