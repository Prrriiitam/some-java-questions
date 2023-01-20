public class Q13{
	
	public static void main(String args[]) {
	   int n=123243;
	   int arr[]=new int[10];
	   while(n!=0) {
		   arr[n%10]=arr[n%10]+1;
		   n=n/10;
	   }
	   for(int i=0;i<10;i++) {
		   if(arr[i]!=0) {
			   System.out.println("freuency of "+i+" is ="+arr[i]);
		   }
	   }
		
	}
	
}