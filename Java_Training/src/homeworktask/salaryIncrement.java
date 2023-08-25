package homeworktask;
import java.util.*;
public class salaryIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the salary amount");
int sal= sc.nextInt();
System.out.println("Enter the gender type male:m and female:f");
char  gen =sc.next().charAt(0);
System.out.println("Enter the year of experence");
int exp=sc.nextInt();
if(gen=='f' && exp >5) {
	System.out.println("20% increment  " + "total salary ="+ (0.2*sal+sal));
}else if(gen =='f' && exp>=3 && exp<=5) {
	System.out.println("15% increment " +"total salary =" +(.15*sal +sal));
}
else if(gen=='m' && exp>5) {
	System.out.println("15% increment " +"total salary =" +(.15*sal +sal));
}else if(gen =='m' && exp<=5 && exp>=3) {
	System.out.println("10% increment " +"total salary =" +(.1*sal +sal));
}else {
	System.out.println("You are not eligible for Increment");
}












	}

}
