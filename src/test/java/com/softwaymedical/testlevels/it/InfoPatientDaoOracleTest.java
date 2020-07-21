package com.softwaymedical.testlevels.it;

import static com.softwaymedical.testlevels.it.DataPatientMatcher.patient;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import org.junit.Test;

import com.softwaymedical.testlevels.dao.InfoPatientDao;
import com.softwaymedical.testlevels.dao.InfoPatientDaoOracle;
import com.softwaymedical.testlevels.dto.DataPatient;

public class InfoPatientDaoOracleTest {

	// Simulation of dependency injection
	private static final InfoPatientDao INFO_PATIENT_DAO = new InfoPatientDaoOracle();
	private static final DataPatient DATA_PATIENT_P1 = () -> LocalDate.of(2010, 10, 10);

	@Test
	public void givenIdPatient_whenCallingQueryAboutDataPatient_thenFindCorrectDatas() {
		assertThat(INFO_PATIENT_DAO.findData("P1"), is(patient(DATA_PATIENT_P1)));
	}
}
