package com.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SchedouleServiceImpliTest {

	private ScheduleServiceImpli scheduleService;

	@BeforeEach
	void setUp() {
		scheduleService = new ScheduleServiceImpli();
	}

	@Test
	void 腹減り金あり() {
		String actual = scheduleService.createSchedule(true, 1000);
		assertThat(actual).isEqualTo("外食にする");
	}

	@Test
	void 腹減り金なし() {
		String actual = scheduleService.createSchedule(true, 0);
		assertThat(actual).isEqualTo("寝る");
	}

	@Test
	void 満腹金あり() {
		String actual = scheduleService.createSchedule(false, 1000);
		assertThat(actual).isEqualTo("寝る");
	}

	@Test
	void 満腹金なし() {
		String actual = scheduleService.createSchedule(false, 0);
		assertThat(actual).isEqualTo("寝る");
	}

}
