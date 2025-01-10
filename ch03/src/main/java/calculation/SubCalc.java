package calculation;

public class SubCalc implements ICalculator {

	@Override
	public Integer calc(Integer x, Integer y) {
		return x - y;
	}

}
