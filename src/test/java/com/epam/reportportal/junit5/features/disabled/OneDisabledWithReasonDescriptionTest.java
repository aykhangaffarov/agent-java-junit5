package com.epam.reportportal.junit5.features.disabled;

import com.epam.reportportal.annotations.Description;
import com.epam.reportportal.junit5.DisabledTestTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DisabledTestTest.DisabledTestExtension.class)
public class OneDisabledWithReasonDescriptionTest {
	public static final String TEST_DESCRIPTION_METHOD = "My test description on the method";
	public static final String REASON = "My reason to disable test";

	@Disabled(REASON)
	@Description(TEST_DESCRIPTION_METHOD)
	@Test
	void disabledTest() {
		System.out.println("disabled");
	}

}
