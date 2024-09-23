import junit.framework.TestCase;

public class TestCircleArea2 extends TestCase {

	public void testArea() {
		//fail("Not yet implemented");
		Circle c=new Circle();
		float t=c.area(1);
		assertEquals((float)Math.PI,t);//it checks if t is equal to 3.14......
	}

}
