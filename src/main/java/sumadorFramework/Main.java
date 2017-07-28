package sumadorFramework;


public class Main {

	public static void main(String[] args) {
		int[] a = {1,2,4,5,3,2,5,7};
		int[] b = {1,2,4,5,3,2,5,7};
		int[] c = new int[8];
		

		MassiveObjectContainer moc = new MassiveObjectContainer();
		
		for(int i = 0; i < a.length; i++){
			Sumador sumador = new Sumador(a[i], b[i]);
			moc.add(sumador);
		}
		
		moc.run();
		
		

	}

}
