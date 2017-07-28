package sumadorAparapiOOP;

import sumadorAparapi.Kernel;
import sumadorAparapi.Range;

public class Main {

	public static void main(String[] args) {
		
		int[] a = {1,2,4,5,3,2,5,7};
		int[] b = {1,2,4,5,3,2,5,7};
		int[] c = new int[8];
		
		Sumador[] sumadores = new Sumador[a.length];
		
		for(int i = 0; i < a.length; i++){
			sumadores[0] = new Sumador(a, b, c);
		}
		
		Kernel kernel = new Kernel() {
		    @Override
		    public void run() {
		        int i = getGlobalId();
		        sumadores[i].setI(i);
		        sumadores[i].setC(sumadores[i].getA() + sumadores[i].getB());
		    }
		};

		Range range = Range.create(c.length);
		kernel.execute(range);

	}

}
