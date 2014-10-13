package CalcEngine;

public class FValue {

	public double returnFValue(double PValue, double Years,
			double Rate) {
		return (int) PValue * Math.pow(1 +
				((Rate / 1200)), Years * 12);
	}

}