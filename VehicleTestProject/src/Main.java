import Cars.*;
import Engines.*;

public class Main {

	public static void main(String[] args) {
		
		//Casting Test
		Spacio sp = new Spacio();
		V4 spTemp = (V4) sp.GetEngine();				//Casts EngineSuperClass to v4
		System.out.println(spTemp.HasTurbo());		
		
		Ghibli gb = new Ghibli();
		V6 gbTemp = (V6) gb.GetEngine();				//Casts EngineSuperClass to v6
		System.out.println(gbTemp.GetFuelStarRating());
		
		//Test
		System.out.println("This is a test");
		// I am potato
	}

}
