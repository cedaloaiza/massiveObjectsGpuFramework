package sumadorRootbeer;

import java.awt.image.Kernel;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] a = {1,2,4,5,3,2,5,7};
		int[] b = {1,2,4,5,3,2,5,7};
		int[] c = new int[8];
		
		List<Kernel> jobs = new ArrayList<Kernel>();
		
		for(int i = 0; i < a.length; i++){
			jobs.add(new Sumador(a, b, c, i));
			
		}
		
		Rootbeer rb = new Rootbeer();
		rb.runAll(jobs);		
	}

}
