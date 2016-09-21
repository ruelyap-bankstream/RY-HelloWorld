package Engines;

import Interfaces.*;

public class V4 extends EngineSuperClass implements IFuelEfficiency {
	private boolean HasTurbo;
	private double FuelEfficiency;
	private double StarRating;
	
	public V4(String en, String ft, double enSize, int noCyl) {
		super("V4", ft, enSize, noCyl);
		FuelEfficiency = 4;
		StarRating = 3.5;
		HasTurbo = false;
	}
	
	public V4() {
		super("V4", "Unleaded", 1.6, 4);
		FuelEfficiency = 4;
		StarRating = 3.5;
		HasTurbo = false;
	}

	@Override
	public double GetFuelEfficiency() {
		return FuelEfficiency;
	}

	@Override
	public double GetFuelStarRating() {
		return StarRating;
	}
	
	public boolean HasTurbo() {
		return HasTurbo;
	}
	
	

}