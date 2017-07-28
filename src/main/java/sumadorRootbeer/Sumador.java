package sumadorRootbeer;

public class Sumador implements Kernel {
	private int[] a;
	private int[] b;
	private int[] c;
	private int i;
	
	public Sumador(int[] a, int[] b, int[] c, int i){
		this.a = a;
		this.b = b;
		this.c = c;
		this.i = i;
	}
	
	public void gpuMethod(){
		c[i] = a[i] + b[i];
	}

}

