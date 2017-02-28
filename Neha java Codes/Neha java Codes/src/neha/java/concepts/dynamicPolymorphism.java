package neha.java.concepts;

	//PARENT CLASS

  class Mom1{
		//INSTANCE VARIABLE
		String love="lots of love";
		//METHOD
		public void care(){
			System.out.println("Mom cares for child");
		}
		public void talk(){
			System.out.println("talks sensible");
			
		}
		
	}

	// DERIVED CLASS

	class Child1 extends Mom1{
		String cute="lots of cuteness";
		public void play(){
			System.out.println("cute child plays");
		}
		public void talk(){
			System.out.println("talks insensible");
		}
		public void walk(){
			System.out.println("child walks");
			
		}
	}
	// so, "extends" keyword ensures inheritance and the
	// derived class (Child) extends Parent class (Mom)
	// and all the instance variables and methods of parent
	// class becomes available with the derived class.


	public class dynamicPolymorphism {
		public static void main(String[] args) {
			/*
			 * Mom1 mom1=new Child1(); because of this statement this code is  pure example of 
			 * dynamic Polymorphism(superclass's all method +subclass's overridden method is called by superclass's reference(which refers to subclass's object.)).
			 */
			
			Mom1 mom1=new Child1(); 
            //mom1.play();   //won't work.
			mom1.talk();
		   mom1.care();
			mom1.talk();
			//mom1.walk();   //won't work.
			
		}

	}










