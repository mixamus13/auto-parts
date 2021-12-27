package com.mixamus.autoparts.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

@Accessors(fluent = true)
public class MyConfigSpringEnvironment {

  @Getter
  private static Environment environment;
  @Getter
  private static Profiles profiles;

  public static void main(String[] args) {

    System.out.println("environment() = " + environment());

  }
}
