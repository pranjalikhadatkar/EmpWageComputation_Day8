

public class Empwagesusecase4 {
	 final int IS_PART_TIME = 1;
	 final int IS_FULL_TIME = 2;
	 final int EMP_WAGES_PER_HOUR = 20;
	
	public void Epmwagespartfulltime(){
		int empHrs = 0;
		int empWages = 0;
		
		int empcheck = (int)Math.round(Math.random());
		switch (empcheck)
		{
		 case IS_PART_TIME:
			 		empHrs = 4;
			 		break;
		 case IS_FULL_TIME:
			 		empHrs = 8;
			 		break;
		 default:
			 	empHrs = 0;
			 	break;
		}
		empWages = empHrs * EMP_WAGES_PER_HOUR;
		System.out.println("emp wages:" + empWages);
	}
	public static void main(String[] args) {
		Empwagesusecase4 obj=new Empwagesusecase4();
		obj.Epmwagespartfulltime();	
		}	
	}
