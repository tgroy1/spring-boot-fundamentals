package com.tgroy.actuatordemo.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component(value = "maxMemory")
public class MemoryHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		boolean invalid = Runtime.getRuntime().maxMemory() < (100 * 1024 * 1024);
		Status status = invalid ? Status.DOWN : Status.UP;
		return Health.status(status).build();
	}

}
