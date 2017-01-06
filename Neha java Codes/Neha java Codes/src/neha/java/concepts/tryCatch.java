package neha.java.concepts;

public class tryCatch {

	public static void main(String args[]){
		//tryCatch trycatch = new tryCatch(); // not needed for static method.
			try {
				start();
			}
			/*catch (Exception e) {
				System.out.println("received message is : "+e.getMessage());
			}*/
			finally{
				System.out.println("finally block in main");
			}
		}
		
		public static void start (){ //throws Exception{
			try{
				// error prone code 
				Integer[] integerArray = {1,2,3};
				System.out.println(integerArray[10]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				//throw new Exception(e);
				//e.printStackTrace();
			}
			catch (Exception e) {
				System.out.println(" broader exception is : "+e.getMessage());
			}
			/*finally{
				System.out.println("finally block in static method.");
			}*/
			System.out.println("after finally block");
		}
	}

