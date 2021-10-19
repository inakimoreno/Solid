package srp;

public class Deduction {

	public Deduction() {}
	
	float calcDeduction(float billAmount, float deductionPercentage) {
		float billDeduction;
		if (billAmount >50000)
			 billDeduction = (billAmount * deductionPercentage +5) / 100;
		else billDeduction = (billAmount * deductionPercentage) / 100;
		return billDeduction;
	}
	
}
