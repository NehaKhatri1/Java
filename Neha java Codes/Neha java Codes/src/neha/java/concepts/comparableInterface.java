package neha.java.concepts;
// This is the POJO/DataModel class that implements Comparable interface & overrides compareTo() method.
class Student implements Comparable<Student>{

	String name;
	int rollno;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public int compareTo(Student o) {
		//System.out.println("i m inside compareTo method");
		return this.getName().compareTo(o.getName());
		
	}
	
	
	
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

}







