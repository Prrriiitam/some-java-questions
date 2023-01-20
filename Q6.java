//
//public class Q6 {
//
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer("i am pritam kumar sarangi");
//		int count=0;
//		for(int i=0;i<sb.length();i++) {
//			if(sb.charAt(i)==' ') {
//				count++;
//			}
//		}
//		System.out.println(count+1);
//
//	}
//
//}//this above approach is also correct
public class Q6{
	
	public static void main(String[]args) {
		StringBuffer sb=new StringBuffer("i am pritam kumar sarangi");
		int count=0;
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)!=' ') {
				count++;
				while(i<sb.length() && sb.charAt(i)!=' ') {
					i++;
				}
			}
		}
		System.out.println(count);
	}
	
}
