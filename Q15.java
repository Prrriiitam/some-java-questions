
public class Q15 {

	public static void main(String[] args) {
		int arr[]= {11,3,2,5,10,19,23,40,45,32};
		int total=0;
		for(int i=0;i<10;i++) {
			int count=0;
			for(int j=2;j<=arr[i];j++) {
				if(arr[i]%j==0) {
					count++;
					
				}
			}
			if(count==1) {
				System.out.println(arr[i]+" is a prime number");
				total++;
			}
			
			
		}
		System.out.println();
		System.out.println("total prime numbers in the array is =  "+total);

	}

}
