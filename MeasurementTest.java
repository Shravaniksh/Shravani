import static org.junit.Assert.*;
import junit.framework.TestCase;

public class MeasurementTest extends TestCase{
	
	public void testAddMeasurement() {
		Measurement m1=new Measurement(20);
		Measurement m2=new Measurement(40);
		m1.add(m2);
		assertEquals(60,m1.getValue());//pass
		assertEquals(40,m2.getValue());
	}
	public void testSubtractMeasurement() {
		Measurement m1=new Measurement(40);
		Measurement m2=new Measurement(20);
		m1.subtract(m2);
		assertEquals(20,m1.getValue());//pass
		assertEquals(20,m2.getValue());
	}

	
}
