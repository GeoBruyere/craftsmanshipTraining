package com.softwaymedical.testlevels.dao;

import java.time.LocalDate;

import com.softwaymedical.testlevels.dto.DataPatient;

public class InfoPatientDaoOracle implements InfoPatientDao {

	@Override
	public DataPatient findData(String idPatient) {
		return () -> LocalDate.of(2010, 10, 10);
	}

}
