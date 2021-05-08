package com.mixamus.autoparts.actuators;

import static org.springframework.boot.actuate.health.Health.down;
import static org.springframework.boot.actuate.health.Health.up;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

  @Override
  public Health health() {
    int errorCode = check();
    if (errorCode != 0) return down().withDetail("Error Code", errorCode).build();
    return up().build();
  }

  private int check() {
    return 0;
  }
}
