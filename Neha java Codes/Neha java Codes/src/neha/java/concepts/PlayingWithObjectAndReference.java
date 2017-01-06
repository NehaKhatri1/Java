package neha.java.concepts;

import java.util.ArrayList;
import java.util.List;

class Dog{
	void bark(){

	}
}

public class PlayingWithObjectAndReference {

	public static void main(String args[])
	{


		//***************** Reference & object Example 1 starts .**********************************


		List<Object> ListofDogObject=new ArrayList<Object>();
		Dog aDog =new Dog();
		ListofDogObject.add(aDog);
		for (int i=0;i<ListofDogObject.size();i++){
		//	Dog d=ListofDogObject.get(0);  // this will give a complie time error like type mismatch cannot convert from object class to dog .

			// but this will work.
			Object  o=	ListofDogObject.get(0);	
		}

		//************************* Reference & object Example 1 ends.********************************

		List<Dog> ListofDogObject1 =new ArrayList<Dog>();
		Dog aDog1 =new Dog();
		ListofDogObject1.add(aDog1);
		for (int j=0;j<ListofDogObject1.size();j++){
			Dog d1=ListofDogObject1.get(0);  // It will work .
			// but this will work because Object class is superclass of all the classes(Dog).
			Object  ob=	ListofDogObject1.get(0);	
		}
	}




}
