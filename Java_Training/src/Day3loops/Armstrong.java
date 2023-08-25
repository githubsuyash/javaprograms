package Day3loops;

public class Armstrong {
// 153=1ka cube+ 5ka cube+3ka cube
	public static void main(String[] args) {
		int num =153;
		int t = num;
		int c= 0;
			while(num>0){
				c++;
				num = num/10;
			}num= t;
			int sum=0;
			while(num>0) {
				int r= num%10;
				// by default int java.lang class
				//inside class function present
				sum = sum+(int)Math.pow(r,c);
				num= num/10;
			}
			if(t==sum) {
				System.out.println("Armstrong");
		}else {
			System.out.println("Not a Armstong");
		}
			
		

	}

}
