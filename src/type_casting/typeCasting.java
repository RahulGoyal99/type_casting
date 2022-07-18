package type_casting;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit conversion
				System.out.println("Implicit Type_Casting");
				char a='x';
				System.out.println("Value of a: " +a);
				
				int b=a;
				System.out.println("Value of b: " +b);
				
				float c=a;
				System.out.println("Value of c: " +c);
				
				double d=a;
				System.out.println("Value of d: " +d);
				
				long e=a;
				System.out.println("Value of e: " +e);
				
						
				System.out.println("\n");
				
				System.out.println("Explicit Type_Casting");
				//explicit conversion
				
				double y=12.5;
				int z=(int)y;
				System.out.println("Value of y: "+y);
				System.out.println("Value of z: "+z);
	}
}