package Brands;

import Enums.Countries;
import Interfaces.*;

public class BrandSuperClass implements IBrand {
	private String Name;
	private Countries Country;
	
	public BrandSuperClass (String na, Countries co) {
		this.Name = na;
		this.Country = co;
	}
	
	@Override
	public String GetName() {
		return Name;
	}

	@Override
	public Countries GetCountry() {
		return Country;
	}
	
}
