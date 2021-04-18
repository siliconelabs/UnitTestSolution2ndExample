package com.udacity.examples.Testing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.Test;

public class MockTest {

	/**
	 * What is a mock?
	 * How to mock?
	 * How to return multiple values using mock
	 */
	
	
	@Test
	public void returnMultipleValues() {
		Map mockList = mock(Map.class);

		when(mockList.get("salih")).thenReturn(7);
		when(mockList.get("ali")).thenReturn(5);

		assertEquals(7, mockList.get("salih"));
		assertEquals(5, mockList.get("ali"));
	}

}
