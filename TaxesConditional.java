package com.qa.community;

public class TaxesConditional {
	
	public static void main(String[] args) {
		
		System.out.println("---Tax Percentage---");
		System.out.println(taxPercent(2000) + "%");
		System.out.println(taxPercent(16000) + "%");
		System.out.println(taxPercent(25000) + "%");
		System.out.println(taxPercent(40000) + "%");
		System.out.println(taxPercent(60000) + "%");
		
		System.out.println("---Tax Amount---");
		System.out.println("£" + taxAmount(2000));
		System.out.println("£" + taxAmount(16000));
		System.out.println("£" + taxAmount(25000));
		System.out.println("£" + taxAmount(40000));
		System.out.println("£" + taxAmount(60000));
		
		System.out.println("---Methods Combined---");
		comibineMethods(16000);
		comibineMethods(25000);
		comibineMethods(2000);
		comibineMethods(48000);
		comibineMethods(38000);
		
	}
	
	public static int taxPercent(int salary) {
		int percent = 0;

		if (salary > 0 && salary < 14999) {
			return percent = 0;
		}

		if (salary > 14999 && salary < 19999) {
			return percent = 10;
		}

		if (salary > 19999 && salary < 29999) {
			return percent = 15;
		}

		if (salary > 29999 && salary < 44999) {
			return percent = 20;
		}

		if (salary > 45000) {
			return percent = 25;
		}

		return percent;
	}

	public static double taxAmount(int salary) {
		double amount = 0;

		if (salary > 0 && salary < 14999) {
			return amount = salary;
		}

		if (salary > 14999 && salary < 19999) {
			return amount = salary * 0.1;
		}

		if (salary > 19999 && salary < 29999) {
			return amount = salary * 0.15;
		}

		if (salary > 29999 && salary < 44999) {
			return amount = salary * 0.2;
		}

		if (salary > 45000) {
			return amount = salary * 0.25;
		}

		return amount;
	}
	
	public static void comibineMethods(int num) {
		
		int percent = taxPercent(num);
		double amountTaxed = taxAmount(num);
		
		System.out.println("Salary: £" + num + " = £" + amountTaxed + " taxed (" + percent + "%)");
		
	}

}
