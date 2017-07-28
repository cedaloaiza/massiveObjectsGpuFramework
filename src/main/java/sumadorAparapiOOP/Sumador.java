package sumadorAparapiOOP;

public class Sumador {
	
	private int[] a;
	private int[] b;
	private int[] c;
	private int i;
	
	
	public int getA() {
		return a[i];
	}

	public int getB() {
		return b[i];
	}

	public void setC(int c) {
		this.c[i] = c;
	}

	public void setI(int i) {
		this.i = i;
	}


	
	public Sumador(int[] a, int[] b, int[] c){
		this.a = a;
		this.b = b;
		this.c = c;
	}


}
