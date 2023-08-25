package Day3loops;

public class replacefirstandlastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =1235; //5321 =5000+230+1
		int t= num;
		int last =num%10;
		System.out.println(last);
	int c=0;
		while(num>10) {
			c++;
			num= num/10;
			
		}
		System.out.println("c"+c);
		int first = num;
		System.out.println(first);
		num=t;
		System.out.println(num);
		num= num/10;
		System.out.println(num);
		int mid =num%(int)Math.pow(10, c-1);
		System.out.println(mid);
		num=last*(int)Math.pow(10, c)+mid*10+first;
		System.out.println(num);

	}

}
