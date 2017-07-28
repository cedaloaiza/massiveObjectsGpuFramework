package sumadorAparapi;

public class Main {

	public static void main(String[] args) {
		
		int[] a = {1,2,4,5,3,2,5,7};
		int[] b = {1,2,4,5,3,2,5,7};
		int[] c = new int[8];
		
		Kernel kernel = new Kernel() {
		    @Override
		    public void run() {
		        int i = getGlobalId();
		        c[i] = a[i] + b[i];
		    }
		};

		Range range = Range.create(c.length);
		kernel.execute(range);

	}

}
