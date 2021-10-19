package srp;

import java.util.Date;

public class Bill {
public String code;
public Date billDate;
public float billAmount;
public float VAT;
public float billDeduction;
public float billTotal;
public int deductionPercentage;
// Fakturaren totala kalkulatzen duen metodoa.
public void totalCalc() {
	Deduction ded = new Deduction();
	VAT vat = new VAT((float)0.16);
	// Dedukzioa kalkulatu
	billDeduction = ded.calcDeduction(billAmount, deductionPercentage);
	// VAT kalkulatzen dugu
	VAT = vat.calcVAT(billAmount, code);
	// Totala kalkulatzen dugu
	billTotal = (billAmount - billDeduction) + VAT;
}
}
