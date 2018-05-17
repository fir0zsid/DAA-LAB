import java.util.*;

class QS {
	
	void sort(int a[],int low, int high) {
		if(low<high) {
			int p = partition(a,low,high);
			sort(a,low,p-1);
			sort(a,p+1,high);
		}
	}
	
	int partition(int a[],int low ,int high) {
		
		int pivot = a[low]; // taking 1st element as pivot
		int i = low+1;
		int j = high;
		
		
		while(low<high) {
			while(a[i]<=pivot && i<high) //traversing from left to right
				i++;
			while(a[j]>pivot) // traversing from right to left
				j--;
			
			if(i<j) {
				//swap(a[i],a[j]); cannot be done coz java has no pointer
				
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				
			}else {     // swap(a[i], a[j])
				
				int temp = a[low];
				a[low] = a[j];
				a[j] = temp;
			
				
				return j;
				}
		}
		return j;
	}

	
}

public class QuickSort{
	public static void main(String[] args){
		Random r = new Random();
		int n;
		System.out.print("Provide number of inputs:");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int a[] = new int[n];
		System.out.println("Unsorted array:\n----------------------");
		for(int i=0;i<n;i++)
		{
			a[i] = r.nextInt(100);
			System.out.println(a[i]);
		}
		QS q = new QS();
		long Stime = System.nanoTime();
		q.sort(a, 0, n-1);
		long Etime = System.nanoTime();
		
		System.out.println("Sorted array:\n--------------------------");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Time Required for sorting is: "+((Etime-Stime)/1000000));
	}
	

}
