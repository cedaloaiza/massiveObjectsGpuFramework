package sumadorFramework;
 



public class Sumador{
	private int a;
	private int b;
	private int c;
	
	public Sumador(int a, int b){
		this.a = a;
		this.b = b;
	}

	
	@gpuMethod
	public void gpuMethod(){
		c = a + b;
	}

}


