package Day3loops;

public class primenumber {

	public static void main(String[] args) {
		int num =6;
		int c=0;
		for(int i= 1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
			if(c==2) {
				System.out.println("Prime ");
			}else {
				System.out.println("Not Prime");
			
		}

	}

}
