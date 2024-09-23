import java.io.Console;

import junit.framework.TestCase;

public class RectangleTest2 extends TestCase {
	public void testareaval() {
		//pass("Not yet implemented");
		Rectangle rect=new Rectangle();
		
		rect.setLength(2);
		rect.setBreadth(2);
		float x=rect.area();
		System.out.println(x);
		assertEquals((float) 4,x);//it checks if x is equal to 4
	

}
	

}
