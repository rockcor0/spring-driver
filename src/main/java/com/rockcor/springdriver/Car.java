/**
 * 
 */
package com.rockcor.springdriver;

/**
 * @author ricardodelgadocarreno
 *
 */
public class Car implements IVehicle{
	
	private int petrolTank;

	@Override
	public void move() {
		if( petrolTank > 0 )
			petrolTank --;
		
	}

}
