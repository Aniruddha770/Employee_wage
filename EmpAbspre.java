package Assignments;

public class EmpAbspre {
	public static void main(String[] args) {
		int isfulltime=1;
		int empcheck = (int) Math.floor(Math.random()*10)%2;
		if (empcheck== isfulltime)
			System.out.println("emp is present");
		else
			System.out.println("emp is absent");
	}

}
