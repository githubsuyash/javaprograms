package Day3loops;

public class firstandlastdigitofnumber {

	public static void main(String[] args) {
		int n=212356459;
		int first = 0,last;
		last= n%10;
		while(n!=0) {
			first =n%10;
			n =n/10;
		}
		System.out.println("First = "+first + " "+"Last = "+ last);
		
	}

}
