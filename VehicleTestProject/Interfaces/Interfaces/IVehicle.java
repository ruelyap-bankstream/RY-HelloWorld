package Interfaces;

import Brands.BrandSuperClass;
import Engines.EngineSuperClass;

public interface IVehicle {
	String GetName();
	int GetNoOfWheels();
	int GetNoOfDoors();
	String GetFuelType();
	BrandSuperClass GetBrand();
	
	EngineSuperClass GetEngine();
	
	String GetType();
}
