package pkg1;

public class Student {
	int age;
	int roll_no;
	public void display() {
		System.out.println("Welcome all");
	}
	
	public void display2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		Student ob1=new Student();
		
		System.out.println(ob1.age);
		System.out.println(ob1.roll_no);
		
		ob1.age=20;
		ob1.roll_no=5;
		System.out.println(ob1.age);
		System.out.println(ob1.roll_no);
		
		ob1.display();
		ob1.display2();
		
	}
}


