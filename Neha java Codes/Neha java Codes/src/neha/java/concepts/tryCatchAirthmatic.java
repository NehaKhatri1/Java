package neha.java.concepts;

//class operations throws Exception{


//}
public class tryCatchAirthmatic {
	public static void main(String args[]){
		try{
			divideByZero() ;

		}catch(Exception  ex){
			System.out.println("superclass Exception is"+ex);  
		}
 finally{
	 
	 System.out.println("i m finally");
 }
	}



	public static void divideByZero() throws Exception {
		int a=100;
		int b=0;
		try{
			int c = a/b;
			System.out.println("Value of c "+c);

		}
		catch(ArithmeticException arh)	{
			//throw arh;
			System.out.println("narrow error is "+arh.getMessage());	
		}
		catch(Exception e){
			System.out.println("error is "+e.getMessage());
		}
		finally{
			 
			 System.out.println("i m finally of static method.");
		 }

	}

}
