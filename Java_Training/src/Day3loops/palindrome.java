package Day3loops;

public class palindrome {

	public static void main(String[] args) {
	 int num = 121;
	 int sum =0;
	 int t= num;
	while(num!=0) {
		int r= num%10;
		sum= sum*10+r;
		num=num/10;
		
	}
	
	if(t==sum) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}

	}

}
