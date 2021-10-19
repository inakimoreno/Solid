package srp;

public class VAT {

	private float VAT;
	
	public VAT(float VAT) {
		this.VAT = VAT;
	}
	
	public float calcVAT(float billAmount, String code) {
		if(code.equals("0"))
			return billAmount;
		return this.VAT*billAmount;
	}
	
}
