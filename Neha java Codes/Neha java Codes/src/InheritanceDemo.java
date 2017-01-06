


	//package basicjavatutorial;

	//PARENT CLASS

	class Mom{
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

	class Child extends Mom{
		String cute="lots of cuteness";
	public void play(){
		System.out.println("cute child plays");
	}
	public void talk(){
		System.out.println("talks insensible");
	}
	}
	// so, "extends" keyword ensures inheritance and the
	// derived class (Child) extends Parent class (Mom)
	// and all the instance variables and methods of parent
	// class becomes available with the derived class.


	public class InheritanceDemo {
		public static void main(String[] args) {
			Mom mom;
			mom = new Child();
			//Child child=new Child();
//			mom.care();
//			mom.play();
			mom.talk();
			
		}

	}



