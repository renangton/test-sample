package com.test;

import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpli implements ScheduleService {

	@Override
	public String createSchedule(boolean isHungry, int money) {
		if (isHungry && money >= 1000) {
			return "外食にする";
		}

		return "寝る";
	}

}
