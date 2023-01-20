import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		int n=sc.nextInt();
		int count=0;
		while(n!=0) {
			n=n>>1;
			count++;
		}
		System.out.println("number of bits = "+count);

	}

}
