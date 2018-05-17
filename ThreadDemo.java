import java.util.*;

class GenerateRandom extends Thread{
	int randomNumber;
	public void run() {
		while(true) {
			try {
				Random r = new Random();
				randomNumber = r.nextInt(10);
				System.out.println("Random number generated is : "+randomNumber);
				Thread t2 = new Thread(new GenerateSquare(randomNumber));
				t2.start();
				Thread t3 = new Thread(new GenerateCube(randomNumber));
				t3.start();
				Thread.sleep(1000);
			} catch(Exception e) {
					e.printStackTrace();
			}
		}
	}
}

class GenerateSquare extends Thread {
	int square;
	public GenerateSquare(int x) {
		square = (x*x);
	}
	
	public void run() {
		System.out.println("It's Square is:" + square);
	}
}

class GenerateCube extends Thread {
	int cube;
	public GenerateCube(int x) {
		cube =(x*x*x);
	}
	
	public void run() {
		System.out.println("It's Cube is:" +cube);
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t1 = new GenerateRandom();
		t1.start();
	}
	
	
}
