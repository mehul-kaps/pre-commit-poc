package com.example.precommit.hookpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrecommitHookPocApplication {

  private int uui = 42;

  public static void main(String[] args) {
    SpringApplication.run(PrecommitHookPocApplication.class, args);
  }

  public void unusedMethod() {
    System.out.println("This method is never called.");
  }
}
