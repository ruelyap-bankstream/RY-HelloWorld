package Engines;

import Interfaces.*;

public class V6 extends EngineSuperClass implements IFuelEfficiency {
	private boolean HasTurbo;
	private double FuelEfficiency;
	private double StarRating;
	
	public V6(String en, String ft, double enSize, int noCyl) {
		super("V6", ft, enSize, noCyl);
		FuelEfficiency = 2.0;
		StarRating = 2.5;
		HasTurbo = true;
	}
	
	public V6() {
		super("V6", "Premium", 3.5, 6);
		FuelEfficiency = 2.0;
		StarRating = 2.5;
		HasTurbo = true;
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
