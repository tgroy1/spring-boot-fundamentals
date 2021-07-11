package com.tgroy.actuatordemo.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component(value = "custom")
public class CustomHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		if (!isCustomLogicHealthy()) {
			return Health.down().withDetail("Custom logic", "Unhealthy").build();
		}
		return Health.up().build();
	}

	private boolean isCustomLogicHealthy() {
		// write logic to determine health of application
		return true;
	}

}
