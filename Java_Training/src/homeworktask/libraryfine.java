package homeworktask;
import java.util.*;

public class libraryfine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Days");
		int days= sc.nextInt();
		if(days<=0) {
			System.out.println("Invalid input");
		}else if(days<=5 &&days>0) {
			System.out.println(days*1);
		}else if(days>5 && days<=10) {
			System.out.println(5+ (days-5)*2);
		}else if(days>10 && days<=15) {
			System.out.println(5+10+(days-10)*5);
		}else {
			System.out.println(5+10+25+(days-15)*10);
		}
		

	}

}
