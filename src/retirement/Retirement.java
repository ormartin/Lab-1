package retirement;
import java.util.Scanner;

public class Retirement {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many years do you plan to work?");
		int WorkingYears = sc.nextInt();
		System.out.println("What's your annual expected return on investment while working?");
		double WorkingReturn = sc.nextInt();
		System.out.println("What's your annual expected return on investment while retired?");
		double RetiredReturn = sc.nextInt();
		System.out.println("How long do you want to draw?");
		int DrawYears = sc.nextInt();
		System.out.println("What's your required income?");
		double RequiredIncome = sc.nextInt();
		System.out.println("What's your expected Social Security Income?");
		double SSI = sc.nextInt();
		sc.close();
		double MonthlyDraw = RequiredIncome - SSI;
		double MonthlyInterest = RetiredReturn/1200;
		double WorkingInterest = WorkingReturn/1200;
		double TotalSaved = (MonthlyDraw*(1-(1/Math.pow(1+MonthlyInterest,DrawYears*12))))/MonthlyInterest;
		System.out.println(Math.round(TotalSaved * 100) / 100.0);
		double MonthlySavings = TotalSaved/(((Math.pow((1 + WorkingInterest),WorkingYears*12)-1)/WorkingInterest));
		System.out.println(Math.round(MonthlySavings * 100) / 100.0);
	}
}