package Assignments;

public class wage_parttime {
	public static void main(String[] args) {
		int wageperhr=200;
		int dayhrs=8;
		int wages= wageperhr*dayhrs;
		int wageparttimehrs =4;
		int wagesfrhalfday = wageperhr*wageparttimehrs;
		
		int empcheck=(int)Math.floor(Math.random()*10)%3;
		
		if(empcheck==0) {
		System.out.println("Employee is Absent");
		System.out.println("your Salary is zero");
		}
		
		if(empcheck==1) {
			System.out.println("Employe is present");
			System.out.println("Your salary is $" + wages);
		}
		
		if(empcheck==2) {
			System.out.println("Employe is present but only for half day");
			System.out.println("Your salary is $" + wagesfrhalfday);
		}
		
		
		
	}

}
