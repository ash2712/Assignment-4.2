public class MyClass{
	
		public static void main(String s[])
		{
		Shirts sd = new Shirts (20,90);
		sd.method();
		Shirts sd1 = new Shirts (560,10);
		sd1.method();
		Shirts sd2 = new Shirts ();
		sd2.method();
		} 
}

class Shirts{
	
	private int collarSize;
	private int sleeveLength;
	private String Material;
	
	Shirts(){
		collarSize = 86;
		sleeveLength = 78;
		Material = "Cotton";
		
	}
	Shirts(int collarSize, int sleeveLength)
	{
		this.collarSize = collarSize;
		this.sleeveLength = sleeveLength;
		Material = "Cotton";
	}
	
	public void method(){
		
		System.out.println("The material of this shirt is " + Material);
		System.out.println("The collar size is " + collarSize+" while the sleeve length is " + sleeveLength);
	}
	
	
	
}
