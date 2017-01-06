package neha.java.concepts;
//This is the POJO/DataModel class.

  class Student1  {

	
	public Student1(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
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

	
}
