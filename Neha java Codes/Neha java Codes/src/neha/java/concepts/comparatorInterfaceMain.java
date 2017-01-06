package neha.java.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorInterfaceMain{
	
	class Namecompare implements Comparator<Student1>{  
		@Override
		public int compare(Student1 stu1,Student1 stu2)
		{
			return stu1.getName().compareTo(stu2.getName());
		}

		

	}
	
	public static void main(String args[]){
		comparatorInterfaceMain comparatorInterfaceMain = new comparatorInterfaceMain(); 
		comparatorInterfaceMain.execute();
		
	}
	
	public void execute (){
		Student1 stud1=new Student1("amar",999);
		Student1 stud2=new Student1("akhbar",666);
		Student1 stud3=new Student1("anthony",333);


		List<Student1> ListOfStudentObjects=new ArrayList<Student1>();
		ListOfStudentObjects.add(stud1);
		ListOfStudentObjects.add(stud2);
		ListOfStudentObjects.add(stud3);
		
		Namecompare comparename= new Namecompare();
		 Collections.sort(ListOfStudentObjects,comparename);
		
	}
	
}
