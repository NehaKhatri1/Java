package neha.java.concepts;

class Dog2
{
	void bark(){
		
	}
	
	}


public class PlayingWithObjectAndReferencePart3 {


	//***** Example 3 starts *****************
	public void go(){
		Dog2 aDog=new Dog2();
		Object obj=getObject2(aDog); // will compile.


	}
	public Object getObject2(Object o){
		return o;
	}

	//***** Example 3 ends *****************

}
