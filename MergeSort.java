import java.util.*;

class MS{
	void sort(int a[],int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			sort(a,low,mid); //sorting 1st half
			sort(a,mid+1,high); // sorting other half
			merge(a,low,mid,high);
		}
		else
			return;
	}
	void merge(int a[],int low, int mid,int high) {
		int i = low; // for 1st half
		int j = mid+1; // for other half
		int k = low; // for new array
		int newarr[] = new int[high+1];
		
		//now comparing and sorting
		while(i<=mid && j<=high) {
			if(a[i]<a[j])
				newarr[k++] = a[i++]; 
			else
				newarr[k++] = a[j++];
		}
		
	   while(i<=mid)
		newarr[k++] = a[i++];
	   while(j<=high)
		   newarr[k++] = a[j++];
	   
	   //storing sorted array from new array to our original array
	   for(i=low;i<=high;i++)
		   a[i] = newarr[i];
	}
}



public class MergeSort {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.print("Please provide the number of input: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[n];
		System.out.println("Now provide array elements");
		for(int i=0;i<n;i++)
		{
			//a[i] = r.nextInt(100);
			a[i] = input.nextInt();
		}
		MS m = new MS();
		long Stime = System.nanoTime();
		
		m.sort(a, 0, n-1); //calling sort
		
		long Etime = System.nanoTime();
		System.out.println("Sorted array:\n-----------------------");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		System.out.println("Time Required for sorting is: "+((Etime-Stime)/1000000)+" MicroSeconds");
	}

}
