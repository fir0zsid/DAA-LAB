import java.util.*;

public class Gknapsack {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of Objects: ");
		int n = input.nextInt();
		System.out.println("Enter the Capacity of Knapsack: ");
		double capacity = input.nextInt();
		
		double weight[] = new double[n];
		double profit[] = new double[n];
		double result[] = new double[n];
		
		System.out.println("Enter weight and profit respectively:");
		
		for(int i=0;i<n;i++) {
			weight[i] = input.nextDouble();
			profit[i] = input.nextDouble();
		}
		for(int k = 0;k<n;k++) {
			result[k] = weight[k]/profit[k];
		}
		
		//loop like bubble sort
		
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-1-i;j++) {
				if(result[j] < result[j+1]) {
					double temp = result[j];
					result[j] = result[j+1];
					result[j+1] = temp;
					
					temp = weight[j];
					weight[j] = weight[j+1];
					weight[j+1] = temp;
					
					temp = profit[j];
					profit[j] = profit[j+1];
					profit[j+1] = temp;
					
				}
			}
		
		double pt=0;
		for(int i=0;i<n;i++) {
			while(weight[i] < capacity) {
				pt = pt + profit[i];
				capacity = capacity - weight[i];
				i++;
				if(i>n) break;
				
			}
			
			if(capacity < weight[i]) {
				double f = capacity/weight[i];
				pt = pt +(f*profit[i]);
				i++;
			}
	}
		System.out.print("Profit is: "+pt);	

}
}
