package calculation;

public class MainCalc {

	public static void main(String[] args) {

		ICalculator sum = new SumCalc();
		ICalculator sub = new SubCalc();
		
		Integer result = 0;
		
		// 덧셈 SumCalc()
		result = sum.calc(10,  5);
		System.out.println("result = " + result);
		
		// 뺄셈 SubCalc()
		result = sub.calc(10,  5);
		System.out.println("result = " + result);
	}

}
