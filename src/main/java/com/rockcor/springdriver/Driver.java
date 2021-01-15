/**
 * 
 */
package com.rockcor.springdriver;

/**
 * @author ricardodelgadocarreno
 *
 */
public class Driver {

	private IVehicle vehicle;
	
	public Driver(IVehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void drive() {
		vehicle.move();
	}
	
}
