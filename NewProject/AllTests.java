import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(PerimeterTest.class);
		suite.addTestSuite(PerimeterTest2.class);
		suite.addTestSuite(RectangleTest.class);
		suite.addTestSuite(RectangleTest2.class);
		//$JUnit-END$
		return suite;
	}

}
