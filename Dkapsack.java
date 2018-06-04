import java.util.Scanner;

public class Dkapsack{
	
	public static void main(String [] args) {
		int i,j;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of Objects: ");
		int n = input.nextInt();
		System.out.println("Enter the Capacity of Knapsack: ");
		int capacity = input.nextInt();
		
		int weight[] = new int[n+1];
		int profit[] = new int[n+1];
		int adj[][] = new int[n+1][capacity+1];
		
		System.out.println("Enter weight and profit respectively:");
		
		for(i=0;i<n;i++) {
			weight[i] = input.nextInt();
			profit[i] = input.nextInt();
		}
		
		for(i=0;i<=n;i++)
			for(j=0;j<=capacity;j++) {
				if(i==0 || j== 0)
					adj[i][j] = 0;
				else if(weight[i] > j)
					adj[i][j] = adj[i-1][j];
				else
					adj[i][j] = Math.max((adj[i-1][j]), (adj[i-1][j-weight[i]]    + profit[i]));
			}
		
		System.out.println("Maximum profit:"+adj[n][capacity]);
	}
}
	