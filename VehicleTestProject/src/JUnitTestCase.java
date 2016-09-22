import org.junit.Assert;
import org.junit.Test;


public class JUnitTestCase {

	@Test
	public void RecursionHax() {
		Integer temp = 6;
		Integer Rec = SumAllUsingRec(3);
		Assert.assertEquals(temp, Rec);
		
		temp = 15;
		Rec = SumAllUsingRec(5);
		Assert.assertEquals(temp, Rec);
	}
	
	
	private int SumAllUsingRec(int n) {
		if (n == 0) return 0;
		return (n + SumAllUsingRec(n - 1));
	}

}
