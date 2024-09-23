import junit.framework.TestCase;

public class PerimeterTest extends TestCase {
	public void testperi() {
		//passscase("Not yet implemented");
		Perimeter p=new Perimeter();
		
		p.setLength(2);
		p.setBreadth(2);
		float x=p.perimeter();
		System.out.println(x);
		assertEquals((float) 8,x);//it checks if x is equal to 4
	

}
	

}
