import java.util.Scanner;
public class SalarySlip
{
	/** args the command line arguments
	*/
	public static void main(String[] args)
	{
		int DA,MA,HR,grossPay,IT=0,NetSalary;
		Scanner input = new Scanner(System.in);
		
		System.out.println("***********************");
		
		System.out.println("Enter EMPLOYEE ID");
		System.out.println("***********************");
		int id = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter EMPLOYEE NAME ");
		String name = input.nextLine();
		System.out.println("Enter DESIGNATION ");
		String desig = input.nextLine();
		System.out.println("Enter EMPLOYEE BASIC PAY ");
		int bpay = input.nextInt();
		
		System.out.println("===================================");
		System.out.println("EMPLOYEE SALARYSHIP DETAILS ");
		System.out.println("===================================");
		System.out.println("Employee ID is          : " + id);
		System.out.println("Employee NAME is        : " + name);
		System.out.println("Employee DESIGNATION is : " + desig);
		System.out.println("EMPLOYEE BASIC PAY  	: " + bpay);
		
		if(bpay >= 40000)
		{
			DA = (int)(bpay * 0.40);
			MA = (int)(bpay * 0.30);
			HR = (int)(bpay * 0.20);
			
			System.out.println("DEARNESS ALLOWANCE      : "+ DA);
			System.out.println("MEDICAL ALLOWANCE       : "+ MA);
			System.out.println("HOUSE RENT ALLOWANCE    : "+ HR);
		}
				else if(bpay >= 30000)
		{
			DA = (int)(bpay * 0.35);
			MA = (int)(bpay * 0.25);
			HR = (int)(bpay * 0.15);
			
			System.out.println("DEARNESS ALLOWANCE      : "+ DA);
			System.out.println("MEDICAL ALLOWANCE       : "+ MA);
			System.out.println("HOUSE RENT ALLOWANCE    : "+ HR);
		}
				else if(bpay >= 20000)
		{
			DA = (int)(bpay * 0.30);
			MA = (int)(bpay * 0.20);
			HR = (int)(bpay * 0.10);
			
			System.out.println("DEARNESS ALLOWANCE      : "+ DA);
			System.out.println("MEDICAL ALLOWANCE       : "+ MA);
			System.out.println("HOUSE RENT ALLOWANCE    : "+ HR);
		}
		else
		{
			DA = 2000;
			MA = 1500;
			HR = 800;
			System.out.println("DEARNESS ALLOWANCE      : "+ DA);
			System.out.println("MEDICAL ALLOWANCE       : "+ MA);
			System.out.println("HOUSE RENT ALLOWANCE    : "+ HR);
		}
		grossPay=bpay+DA+MA+HR;
		System.out.println("GrossPay                : "+ grossPay);
		
		if(grossPay >= 80000)
		{
			IT=(int)(grossPay * 0.04);
			NetSalary=grossPay - IT;
			System.out.println("INCOME TAX               : "+ IT);
			System.out.println("================================");
			System.out.println("NETSALARY               : "+ NetSalary);
			System.out.println("================================");
		}
		else if(grossPay >= 60000)
		{
			IT=(int)(grossPay * 0.03);
			NetSalary=grossPay - IT;
			System.out.println("INCOME TAX :"+ IT);
			System.out.println("================================");
			System.out.println("NETSALARY :"+ NetSalary);
			System.out.println("================================");
		}
		
		else if(grossPay >= 50000)
		{
			IT=(int)(grossPay * 0.02);
			NetSalary=grossPay - IT;
			System.out.println("INCOME TAX            :"+ IT);
			System.out.println("================================");
			System.out.println("NETSALARY :"+ NetSalary);
			System.out.println("================================");
		}
		else if(grossPay >= 30000)
		{
			IT=(int)(grossPay * 0.01);
			NetSalary=grossPay - IT;
			System.out.println("INCOME TAX               :"+ IT);
			System.out.println("================================");
			System.out.println("NETSALARY :"+ NetSalary);
			System.out.println("================================");
		}
		
		NetSalary = grossPay - IT;
		System.out.println("*******************************************************************************");
		System.out.println("*******************************************************************************");
		System.out.println(" ");
		System.out.println("		NETSALARY : Indian Rupees : "+ NetSalary );
		System.out.println(" ");
		System.out.println("*******************************************************************************");
		System.out.println("*******************************************************************************");
	}
	
}