package Cars;

import Brands.BrandSuperClass;
import Engines.EngineSuperClass;
import Interfaces.*;

public class CarSuperClass implements IVehicle {
	private String Name;
	private EngineSuperClass Engine;
	private BrandSuperClass Brand;
	private int NoOfDoors;
	private int NoOfWheels;
	
	public CarSuperClass (String na,EngineSuperClass eg, BrandSuperClass br, int doors, int wheels) {
		this.Name = na;
		this.Engine = eg;
		this.Brand = br;
		this.NoOfDoors = doors;
		this.NoOfWheels = wheels;
	}
	
	@Override
	public int GetNoOfWheels() {
		return NoOfWheels;
	}

	@Override
	public int GetNoOfDoors() {
		return NoOfDoors;
	}

	@Override
	public String GetFuelType() {
		return Engine.GetFuelType();
	}

	@Override
	public EngineSuperClass GetEngine() {
		return Engine;
	}

	@Override
	public String GetType() {
		return this.getClass().getTypeName();
	}

	@Override
	public BrandSuperClass GetBrand() {
		return Brand;
	}

	@Override
	public String GetName() {
		return Name;
	}

}

