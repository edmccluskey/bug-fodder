

import java.util.Random;
import org.junit.Test;

public class SieveTest {

	@SuppressWarnings("static-access")
	@Test
	public void testprintSieve1() {
		Sieve s_test = new Sieve();
		Random rand;
		rand= new Random();
		for (int x=1;x<50;x++)
		{
			int[] results_test = new int[x];
			for (int y=0;y<x;y++)
			{
				int rndint=rand.nextInt(50);
				results_test[y]=rndint;
			}
			s_test.printSieve(results_test);
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void testprintSieve2() {
		Sieve s_test = new Sieve();
		int[] results_test = new int[0];
		s_test.printSieve(results_test);
	}

}
