
//usecase1
public class Empwagesusecase1 {
	final int FullTimeEmployee = 1;
	  
	public void checkempstatus() {
		int empstatus = (int) (Math.random() * 10) % 2;
        if (empstatus == FullTimeEmployee)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
	}

	public static void main(String[] args) {
		
		Empwagesusecase1 obj=new Empwagesusecase1();
		obj.checkempstatus();
	}

}

