package neha.java.concepts;

	//PARENT CLASS
interface parents{
	
	void talk();
public void walk();

}

  class Mom3 implements parents{
		//INSTANCE VARIABLE
		String love="lots of love";
		//METHOD
		public void care(){
			System.out.println("Mom cares for child");
		}
		
		
	}

	// DERIVED CLASS

	class Child3 extends Mom3 implements parents{
		String cute="lots of cuteness";
		public void play(){
			System.out.println("cute child plays");
		}
		
		public void walk(){
			System.out.println("child walks");
			
		}
	}
	// so, "extends" keyword ensures inheritance and the
	// derived class (Child) extends Parent class (Mom)
	// and all the instance variables and methods of parent
	// class becomes available with the derived class.


	public class interfacePolymorphism {
		public static void main(String[] args) {
			
						
		}

	}













