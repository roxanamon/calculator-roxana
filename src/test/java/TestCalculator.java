import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestCalculator {
	
	CalculatorRoxana cal = new CalculatorRoxana();
	
	

	@Test
	public void addition() {
		Assert.assertEquals("Failed to add !", 6.0, cal.add(2.0,4.0),0.01d);	
		
	}
	
	@Test
	public void addition2() {
		Assert.assertEquals("Failed to add !", 8.2, cal.add(3.1,5.1),0.01d);	
		
	}
	
	@Test
	public void addition3() {
		Assert.assertEquals("Failed to add !", 30.6, cal.add(22.4,8.2),0.01d);	
		
	}
	
	@Test
	public void subtraction() {
		Assert.assertEquals("Failed subtraction!", 7.8, cal.subtraction(12.3,4.5),0.01d);	
		
	}
	
	@Test
	public void subtraction2() {
		Assert.assertEquals("Failed subtraction!", 19.1, cal.subtraction(23.7,4.6),0.01d);	
		
	}
	
	@Test
	public void subtraction3() {
		Assert.assertEquals("Failed subtraction!", -9.4, cal.subtraction(14.3,23.7),0.01d);	
		
	}
	
	@Test
	public void multiplication() {
		Assert.assertEquals("Failed multiplication!", 55.35, cal.multiplication(12.3,4.5),0.01d);	
		
	}
	
	@Test
	public void multiplication2() {
		Assert.assertEquals("Failed multiplication!", 9.66, cal.multiplication(2.3,4.2),0.01d);	
		
	}
	
	@Test
	public void multiplication3() {
		Assert.assertEquals("Failed multiplication!", 8.55, cal.multiplication(1.9,4.5),0.01d);	
		
	}
	
	@Test
	public void division() {
		Assert.assertEquals("Failed multiplication!", 2.73, cal.division(12.3,4.5),0.01d);	
		
	}
	
	@Test
	public void division2() {
		Assert.assertEquals("Failed multiplication!", 27.62, cal.division(124.3,4.5),0.01d);	
		
	}
	
	@Test
	public void division3() {
		Assert.assertEquals("Failed multiplication!", 15.30, cal.division(35.2,2.3),0.01d);	
		
	}

}
