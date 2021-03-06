import org.junit.Test;


public class Dwite201111Test {
	
	@Test
	public void testProblem1() throws Exception {
		DwiteTestUtils.test(dwite201111p1.class, "201111-DATA1.txt", "201111-OUT1.txt");
	}
	
	
	@Test
	public void testProblem2() throws Exception {
		DwiteTestUtils.test(dwite201111p2.class, "201111-DATA2.txt", "201111-OUT2.txt");
	}
	
	
	@Test
	public void testProblem3() throws Exception {
		DwiteTestUtils.test(dwite201111p3.class, "201111-DATA3.txt", "201111-OUT3.txt");
	}
	
	
	@Test
	public void testProblem4() throws Exception {
		DwiteTestUtils.test(dwite201111p4.class, "201111-DATA4.txt", "201111-OUT4.txt");
	}
	
	
	@Test
	public void testProblem5() throws Exception {
		DwiteTestUtils.test(dwite201111p5.class, "201111-DATA5.txt", "201111-OUT5.txt");
	}
	
}
