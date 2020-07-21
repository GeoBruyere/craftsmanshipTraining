package com.softwaymedical.testlevels.service;

import com.softwaymedical.testlevels.birthDate.DisplayBirthDate;
import com.softwaymedical.testlevels.dao.InfoPatientDao;

public class ServiceDataPatient {

	private InfoPatientDao infoPatientDao;

	public ServiceDataPatient(InfoPatientDao infoPatientDao) {
		this.infoPatientDao = infoPatientDao;
	}

	public String obtainBirthDatePatient(String idPatient) {
		var dataPatient = infoPatientDao.findData(idPatient);
		var displayBirthDate = new DisplayBirthDate(dataPatient.getBirthDate());
		return displayBirthDate.getDisplayableDate();

	}
}
