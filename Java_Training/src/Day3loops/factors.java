package Day3loops;

public class factors {

	public static void main(String[] args) {
		int num= 6;
		int co =0;
		for(int i=1;i<=6;i++) {
			if(num%i==0) {
				System.out.println(i);
				co++;
			}else
			{
				continue;
			}
		
		}	System.out.println("Total count= " + co);

	}

}
