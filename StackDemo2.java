
import java.util.*;

class Stack{
	
	int size=3,elem,top= -1;
	int stack[] = new int[size];
	void push() {
		if(top==size-1) {
			System.out.println("STACK OVERFLOW!!!");
		}else {
			System.out.print("Enter a number:");
			Scanner input = new Scanner(System.in);
			elem = input.nextInt();
			this.top++;
			stack[top] = elem;
		}
	}
	
	void pop() {
		if(top<0){
			System.out.println("STACK UNDERFLOW!!!");
		}else {
			int del;
			del = stack[top];
			System.out.println(del + "is deleted");
			top--;
		}
	}
	
	void display() {
		if(top>size-1) {
			System.out.println("STACK OVERFLOW!!!");
		}else if(top < 0) {
			System.out.println("STACK UNDERFLOW!!!");	
		} else {
			System.out.println("Stack elements are:");
			for(int i = top; i>=0; i--)
			{
				System.out.println(stack[i]);
			}
		}
	}
}
public class StackDemo2{

	public static void main(String[] args) {
		Stack s = new Stack();
		while(true) {	
		System.out.println("Please choose an option:");
		System.out.print("1.push 2.pop 3.display 4.Exit:");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch(choice) {
		case 1: s.push();
				break;
				
		case 2: s.pop();
				break;
	
		case 3: s.display();
				break;
			
		case 4: return;
		default: System.out.println("Wrong choice!!! Please choose from the Options Provided");
				
		}
		}
	}

}
