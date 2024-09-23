import junit.framework.TestCase;//junit preinstalled package in eclipse for running testcases 

public class RectangleTest extends TestCase {
	public void testareaval() {
			//fail("Not yet implemented");
			Rectangle rect=new Rectangle();
			
			rect.setLength(2);
			rect.setBreadth(2);
			float x=rect.area();
			assertEquals(2,x);//it checks if x is equal to 1
		
	
	}

}
