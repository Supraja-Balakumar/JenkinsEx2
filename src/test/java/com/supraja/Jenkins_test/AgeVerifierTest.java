package com.supraja.Jenkins_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgeVerifierTest {

	@Test
	void testCheckEligibility() throws InvalidAgeException {
		AgeVerifier obj=new AgeVerifier();
		assertEquals("Eligible",obj.checkEligibility(20));
		
	}
	
	@Test
	void testCheckEligibility2() throws InvalidAgeException{
		AgeVerifier obj=new AgeVerifier();
		assertThrows(InvalidAgeException.class,()->obj.checkEligibility(10));
	}

}
