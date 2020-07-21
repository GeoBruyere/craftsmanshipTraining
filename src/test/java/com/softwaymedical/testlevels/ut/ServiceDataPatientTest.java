package com.softwaymedical.testlevels.ut;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.Test;

import com.softwaymedical.testlevels.dao.InfoPatientDao;
import com.softwaymedical.testlevels.service.ServiceDataPatient;

/**
 * Unit test for {@link ServiceDataPatient}
 */
public class ServiceDataPatientTest {
	private static final LocalDate THE_21_10_2021 = LocalDate.of(2021, 10, 21);
	private static final InfoPatientDao INFO_PATIENT_DAO_MOCK = mock(InfoPatientDao.class);

	@Test
	public void givenIdPatient_whenCallServiceObtainBirthDateWithIdPatient_thenDaoIsCalledAndBirthDateIsFormatted() {
		when(INFO_PATIENT_DAO_MOCK.findData(anyString())).thenReturn(() -> THE_21_10_2021);
		String birthDatePatient = new ServiceDataPatient(INFO_PATIENT_DAO_MOCK).obtainBirthDatePatient("1P");
		assertThat(birthDatePatient, is("21/10/2021"));
		verify(INFO_PATIENT_DAO_MOCK).findData("1P");
	}
}
