package Assignments;

public class Wages_max_days {
	public static void main(String[] args) {
		
	
	int wageperhr =20;
	int workingdays=0;
	int workinghrs=0;
	 int totalworkinghrs=0;
	
	
	while ((workingdays<= 20) &&  (totalworkinghrs <=100)) {
		int empcheck=(int)Math.floor(Math.random()*10)%3;
		if (empcheck == 0) {
			workinghrs=8;
		}
		else if(empcheck==1) {
			workinghrs=4;
		}
		else {
			workinghrs=0;
		}
	
		workingdays++;
	    totalworkinghrs =totalworkinghrs+workinghrs;
		
		
			}
	        System.out.println("Salary is  "+ totalworkinghrs*wageperhr);

}
}