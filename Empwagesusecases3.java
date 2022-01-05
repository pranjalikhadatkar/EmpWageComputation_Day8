
// usecase3
public class Empwagesusecases3 {
	  final int IS_PART_TIME = 1;
	  final int IS_FULL_TIME = 2;
	  final int EMP_WAGES_PER_HOUR = 20;
	  
	  public void Empwagesperhr() {
		  int emphrs = 0;
		    int empwages = 0;

		    int empcheck =(int)Math.round((Math.random()));
		    System.out.println(empcheck);
		    if (empcheck == IS_PART_TIME)
		    {
		    	emphrs = 4;
		    }
		    else if (empcheck == IS_FULL_TIME)
		    {
		    	emphrs = 8;
		    }
		    else
		    {
		    	emphrs = 0;
		    }
		    empwages = emphrs * EMP_WAGES_PER_HOUR;
		    System.out.println("emp wages:" + empwages); 
	  }
	public static void main(String[] args) {
		Empwagesusecases3 obj=new Empwagesusecases3();
		obj.Empwagesperhr();		
    }
	}
