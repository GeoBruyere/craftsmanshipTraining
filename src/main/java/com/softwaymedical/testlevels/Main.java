package com.softwaymedical.testlevels;

import java.time.LocalDate;

import com.softwaymedical.testlevels.birthDate.DisplayBirthDate;
import com.softwaymedical.testlevels.dao.InfoPatientDao;
import com.softwaymedical.testlevels.service.ServiceDataPatient;

public class Main {

	private static final String idPatient = "P1";
	private static ServiceDataPatient service = new ServiceDataPatient(s -> () -> LocalDate.of(1989, 2, 10));
	private static InfoPatientDao daoInfoPatient = id -> () -> LocalDate.of(1974, 5, 31);

	public static void main(String[] args) {
		// Edge-to-edge
		String birthDateService = service.obtainBirthDatePatient(idPatient);

		// Integration
		LocalDate birthDateFromDao = daoInfoPatient.findData(idPatient).getBirthDate();
		String displayableDateFromDao = new DisplayBirthDate(birthDateFromDao).getDisplayableDate();

		// Acceptance
		String displayableDate = new DisplayBirthDate(LocalDate.of(2000, 10, 25)).getDisplayableDate();
		String displayableDate2 = new DisplayBirthDate(LocalDate.of(2000, 1, 9)).getDisplayableDate();

		System.out.println(displayableDate);
		System.out.println(displayableDate2);
		System.out.println(displayableDateFromDao);
		System.out.println(birthDateService);
	}
}