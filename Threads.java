
/*
import java.util.*;
class Rnumber extends Thread {
	static int num;
	int generateRandom() {	
		Random Randomnumber = new Random();
		return num = Randomnumber.nextInt(10);
	}
	
	public void run() {
		int res;
		while(true) {
			try {
			res = generateRandom();
			System.out.println("Random number Generated is: "+res);
			Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Square extends Thread
{
	
	int generateSquare (int x)
	{
		return (x*x);
	}
	
	public void run() {
		int sq;
		while(true) {
			try	{
			sq = generateSquare(Rnumber.num);
			System.out.println("Random number Generated is: "+sq);
			Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Cube extends Thread {
	int generateCube(int y) {
		return (y*y*y);
	}
	
	public void run() {
		int cu;
		while(true) {
			try {
			cu= generateCube(Rnumber.num);
			System.out.println("Random number Generated is: "+cu);
			Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Threads {

	public static void main(String[] args) {
		Rnumber r = new Rnumber();
		r.start();
		Square s = new Square();
		s.start();
		Cube c = new Cube();
		c.start();
	}
}
	
*/
