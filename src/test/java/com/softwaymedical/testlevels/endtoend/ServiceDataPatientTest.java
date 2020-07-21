package com.softwaymedical.testlevels.endtoend;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import com.softwaymedical.testlevels.dao.InfoPatientDao;
import com.softwaymedical.testlevels.dao.InfoPatientDaoOracle;
import com.softwaymedical.testlevels.service.ServiceDataPatient;

/**
 * End-to-end / edge-to-edge test for {@link ServiceDataPatient}
 */
public class ServiceDataPatientTest {
	private InfoPatientDao infoPatientDao = new InfoPatientDaoOracle();
	// Dependency injection simulation
	private ServiceDataPatient service = new ServiceDataPatient(infoPatientDao);

	@Test
	public void givenPatientIdentifier_whenAskForDisplayingBirthDate_thenReturnFormattedDateForScreen() {
		assertThat(service.obtainBirthDatePatient("P1"), is("10/10/2010"));
	}
}
