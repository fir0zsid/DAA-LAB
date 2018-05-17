import java.util.Scanner;
public class Dijkstra {
	int distance[]=new int[10];
	int parent[]=new int[10];
	int visited[]=new int[10];
	public void dijk(int[][]a, int source, int n){
		int u=-1,v,j,i,min;
		for(v=0;v<n;v++){
			distance[v]=99;
			parent[v]=-1;
		} 
		distance[source]=0;
		for(i=0;i<n;i++){
			min=99;
			for(j=0;j<n;j++){
				if(distance[j]<min&& visited[j]==0){
					min=distance[j];
					u=j;
				}
			}
			
		
			visited[u]=1;
			for(v=0;v<n;v++){
				if(((distance[u]+a[u][v])<distance[v]) && (u!=v) && visited[v]==0)
				{
					distance[v]=distance[u]+a[u][v];
					parent[v]=u;
				}
			}
		}
	}
	void path(int v,int source)
	{
		if(parent[v]!=-1)
			path(parent[v],source);
		if(v!=source)
			System.out.print("->"+v+" ");
	}
	void display(int source,int n){
		int i;
		for(i=0;i<n;i++)
		{
			if(i!=source){
				System.out.print(source+" ");
				path(i,source);
			}
			if(i!=source)
				System.out.print("="+distance[i]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int adj_mat[][]=new int[10][10];
		int i,j,no_nodes,source;
		System.out.println("Enter the number of vertices");
		Scanner input = new Scanner(System.in);
		no_nodes=input.nextInt();
		System.out.println("Enter the weighted matrix");
		for(i=0;i<no_nodes;i++)
			for(j=0;j<no_nodes;j++)
				adj_mat[i][j]=input.nextInt();
		
		System.out.println("Enter the source vertex");
		source=input.nextInt();
		
		Dijkstra tr=new Dijkstra();
		
		tr.dijk(adj_mat,source,no_nodes);
		System.out.println("The shortest path between source "+source+"to remaining vertices are");
				tr.display(source,no_nodes);
		input.close();
	}
}