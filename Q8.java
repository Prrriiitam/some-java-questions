import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "1233838334";
		String d = "99992172", res = "";
		int i = s.length()-1;// 9
		int j = d.length()-1;// 7
		int carry = 0;
		int n = Integer.parseInt(""+s.charAt(0));//n=1
		//System.out.println(n);
		while(i>=0 && j>=0) {
			res = (carry + Integer.parseInt(""+s.charAt(i)) + Integer.parseInt(""+d.charAt(j)))%10 + res;
			carry = (carry + Integer.parseInt(""+s.charAt(i--)) + Integer.parseInt(""+d.charAt(j--)))/10;
		}
		while(i>=0) {
			res = (carry + Integer.parseInt(""+s.charAt(i)))%10 + res;
			carry = (carry + Integer.parseInt(""+s.charAt(i--)))/10;
		}
		while(j>=0) {
			res = (carry  + Integer.parseInt(""+d.charAt(j)))%10 + res;
			carry = (carry + Integer.parseInt(""+d.charAt(j--)))/10;
		}
		if(carry!=0)
			res = carry + res;
		System.out.println(res);
	}

}
