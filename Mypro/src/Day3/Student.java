package Day3;

public class Student {
	private String name;
	private int grade;
	
	
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student NAME:"+name +"\nStudents Grade:"+grade;
	}
	public static void main(String[] args) {
		Student a =new Student("LOKESH",010);
		System.out.println(a);
		
		
	}
	
}



