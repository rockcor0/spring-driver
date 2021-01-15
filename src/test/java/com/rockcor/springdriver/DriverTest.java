/**
 * 
 */
package com.rockcor.springdriver;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

/**
 * @author ricardodelgadocarreno
 *
 */
public class DriverTest {
	
	@Test
	public void driverCallsMove() {
		//Create a mock vehicle
		IVehicle falseVehicle = mock(IVehicle.class);
		
		//Instance injection for the test
		Driver driver = new Driver(falseVehicle);
		driver.drive();
		
		//Test
		verify(falseVehicle, times(1)).move();
	}
}
