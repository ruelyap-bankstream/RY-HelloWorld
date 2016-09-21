package Cars;

import Brands.Maserati;
import Engines.V6;

public class Ghibli extends CarSuperClass{
	
	public Ghibli() {
		super("Toyota Spacio", new V6(), new Maserati(), 2, 4);
	}

}
