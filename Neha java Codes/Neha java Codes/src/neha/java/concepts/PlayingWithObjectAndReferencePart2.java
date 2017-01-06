package neha.java.concepts;

class Dog1{
	void bark(){}
}


public class PlayingWithObjectAndReferencePart2 {

	//***** Example 2 starts *****************
	public void go1(){
		Dog1 aDog=new Dog1();
	//	Dog sameDog=getObject1(aDog); // won't complie .type mismatch error


	}
	public Object getObject1(Object o){
		return o;
	}
	//***** Example 2 ends *****************


}
