
public class Q19 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,5,80,90,75};
		int b[]=new int[arr.length+1];
		int n=355555;
		int x=9;
		x--;
		int j=0;
		for(int i=0;i<x;i++) {
			b[j++]=arr[i];
		}
		b[j++]=n;
		for(int i=x;i<arr.length;i++) {
			b[j++]=arr[i];
		}
		for(int e=0;e<b.length;e++) {
			System.out.print(b[e]+" ");
		}
	}
}
