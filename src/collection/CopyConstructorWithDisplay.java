package collection;

class Student
{
	String name;
	int rollno;
	
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	Student(Student s)
	{
		name=s.name;
		rollno=s.rollno;
	}
	
	void Display()
	{
		System.out.println("Student Name:"+name+"\n"+"Student Roll No:"+rollno);
	}
}

public class CopyConstructorWithDisplay {
	
	public static void main(String[] args) {
		Student s1=new Student("Vikrant",90);
		Student s2=new Student(s1);
		s1.Display();
		s2.Display();
	}

}
