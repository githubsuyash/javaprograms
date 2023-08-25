package Day3loops;

public class strongnumber {

	public static void main(String[] args) {
		int num =145;
		int f=1;
		while(num>0) {
			int r= num%10;
			for(int i=r;i>0;i--) {
				f=f*i;
			}
			System.out.println("F =" +f);
			num = num/10;
			f=1;
			
		}

	}

}
