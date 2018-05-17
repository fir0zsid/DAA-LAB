
import java.util.Scanner;

public class Prism{
	static void prims(int arr[][],int n) {
		int i,j,ne,min,sum=0,u=0,v=0;
		int visit[]=new int[n];
		
		for (i = 0; i < visit.length; i++) 
			visit[i]=0;
		visit[0]=1;
		ne=1;
		while (ne<n) {
			min=999;
			for (i = 0; i < n; i++) {
				if(visit[i]==1) {
					for (j = 0; j < n; j++) {
						if(arr[i][j]<min && arr[i][j]!=0) {
							min=arr[i][j];
							u=i;v=j;
						}
					}
				}
			}	
			
			if(visit[u]==1 &&visit[v]==0) {
				visit[v]=1;
				sum+=min;
				ne++;
				System.out.println("");
				System.out.println(u+" to "+v+"---->"+min);
			}
			
			arr[u][v]=arr[v][u]=999;
			
		}
	System.out.println("\nSum is : "+sum);
}
	public static void main(String[] args) {
		System.out.println("enter number of vertices");
		Scanner scanner = new Scanner(System.in);
		int no_vrtx= scanner.nextInt();
		System.out.println("enter weighted graph");
		int w[][]=new int[no_vrtx][no_vrtx];
		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < w.length; j++) {
				w[i][j]= scanner.nextInt();
			}
		}
				
		prims(w,no_vrtx);
		scanner.close();
								
	}
			
}