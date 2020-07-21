package com.softwaymedical.testlevels.dao;

import com.softwaymedical.testlevels.dto.DataPatient;

@FunctionalInterface
public interface InfoPatientDao {

	DataPatient findData(String idPatient);

}
