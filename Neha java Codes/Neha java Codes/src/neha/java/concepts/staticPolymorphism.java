package neha.java.concepts;



//PARENT CLASS

class Mom2{
	//INSTANCE VARIABLE
	String love="lots of love";
	//METHOD
	public void care(){
		System.out.println("Mom cares for child");
	}
	public void talk(){
		System.out.println("mumma talks ");

	}
	public void walk(){
		System.out.println("child walks");

	}
}

// DERIVED CLASS

class Child2 extends Mom2{
	String cute="lots of cuteness";
	public void play(){
		System.out.println("cute child plays");
	}
	public void talk(int i){
		int j=i;
		System.out.println("child talks "+j);
	}
	public void walk(){
		System.out.println("child walks");

	}
}
// so, "extends" keyword ensures inheritance and the
// derived class (Child) extends Parent class (Mom)
// and all the instance variables and methods of parent
// class becomes available with the derived class.


public class staticPolymorphism {
	public static void main(String[] args) {
		/*
		 * static polymorphism is also known as method overloading.
		 */

		//Mom1 mom1=new Mom1(); 
		Child2 child2=new Child2();
		child2.play();   
		// method overloading
		child2.talk(10); 
		child2.talk();


		child2.care();
		child2.walk();




	}

}
