package neha.java.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class comparableInterfaceMain {

	public static void main(String[] args){
		
		Student student1=new Student("neha",101);
		Student student2=new Student("lovely",102);
		Student student3=new Student("Anny",103);
		
		List<Student> listOfStudentObject=new ArrayList<Student>();
		listOfStudentObject.add(student1);
		listOfStudentObject.add(student3);
		listOfStudentObject.add(student2);
		
		
		System.out.println("printing list without sort"); 
		for(int i=0; i<listOfStudentObject.size();i++)
		{
		System.out.println(listOfStudentObject.get(i).getName());
		}
		//sort() implementation
		Collections.sort(listOfStudentObject); //what field of student class is sorted ,depends on the field mentioned in CompareTo() of Comparable Interface. 
		System.out.println("printing list after sort ");
		for(int j=0; j<listOfStudentObject.size();j++)
		{
			System.out.println(listOfStudentObject.get(j).getName());
		}
		//System.out.println("printing list after sort"+listOfStudentObject);
	}
}



