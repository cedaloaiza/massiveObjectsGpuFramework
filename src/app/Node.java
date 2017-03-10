package app;

public class Node implements MassiveObject {
	
	private int c = 5;
	private int sum = 0; 
	private int[] arr = {5, 5};
	private ExtraObject lo;
	

	@Override
	public int sumKernel(int a, int b, ExtraObject o, int[] arri) {
		//Easiest implementation. We are only worried about input and output of the kernel
		sum = a + b;
		//We have to consider class attributes in addition to kernel inputs
		sum = a + b + c;
		//We have to consider attributes from a object passed as kernel input.
		sum = a + o.a;
		//We have to consider attributes from a object which is an class attribute
		sum= lo.b + b;
		//We have to consider array positions of a class attribute array
		sum = arr[1] + b;
		//We have to consider array positions from an input array
		sum = arri[2] + b;
		//We could walk across an entire array or even across an entire object.
		//We could invoke methods from this or another class.
		
		
		return sum;
	}

}
