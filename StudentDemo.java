import java.util.*;

class Student{
	String name;
	String usn;
	String phno;
	String branch;
	Scanner input = new Scanner(System.in);
	void read() {
		System.out.println("Enter the Name,branch,usn,phone Number respectively:");
		System.out.println("-----------------------------------------------------");
		name = input.next();
		branch = input.next();
		usn = input.next();
		phno =input.next();
	}
	void display() {
		System.out.println("Name is:  " + name);
		System.out.println("Branch is:  " + branch);
		System.out.println("USN is:  " + usn);
		System.out.println("Phone Number is:  " + phno);
		
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		int n,i;
		System.out.print("Provide the number of Students: ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		Student sarray[] = new Student[n];
		for(i=0;i<n;i++) {
			System.out.println("Enter the detail of student:"+(i+1));
			sarray[i] = new Student();
			sarray[i].read();
		}
		for(i=0;i<n;i++) {
			System.out.println("The detail of the Students are:\n---------------------------\nStudent:"+(i+1));
			sarray[i].display();
		}
		input.close();
	}

}
