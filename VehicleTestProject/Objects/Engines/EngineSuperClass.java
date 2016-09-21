package Engines;

import Interfaces.*;

public class EngineSuperClass implements IEngine {
	private double FuelConsumption;
	private int Cylinders;
	private String EngineName;
	private String FuelType;
	
	public EngineSuperClass (String en, String ft, double enSize, int noCyl) {
		this.EngineName = en;
		this.FuelConsumption = enSize;
		this.Cylinders = noCyl;
		this.FuelType = ft;
	}
	
	@Override
	public double GetFuelConsumption() {
		return FuelConsumption;
	}

	@Override
	public int GetNoOfCylinders() {
		return Cylinders;
	}

	@Override
	public String GetEngineName() {
		return EngineName;
	}

	@Override
	public String GetFuelType() {
		return FuelType;
	}
}
