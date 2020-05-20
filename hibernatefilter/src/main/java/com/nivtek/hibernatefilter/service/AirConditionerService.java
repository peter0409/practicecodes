package com.nivtek.hibernatefilter.service;

import java.util.List;

import com.nivtek.hibernatefilter.dao.AirConditionerDao;
import com.nivtek.hibernatefilter.entity.AirConditioner;

public class AirConditionerService {

	public List<AirConditioner> getAirConditioners(ACCriteriaService filter) {

		AirConditionerDao airConditionerDao = new AirConditionerDao();

		return airConditionerDao.getAirConditioners(filter);

	}
}
