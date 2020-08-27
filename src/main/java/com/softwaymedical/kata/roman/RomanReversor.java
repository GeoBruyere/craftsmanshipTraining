package com.softwaymedical.kata.roman;

public class RomanReversor {
	private Integer number;

	public RomanReversor(int number) {
		this.number = number;
	}

	public String conversionToArabic() {
		String[] numberString = new StringBuilder(number.toString()).reverse().toString().split("");
		String roman = "";
		for (int i = 0; i < numberString.length; i++) {
			Integer currentDigit = Integer.valueOf(numberString[i]);
			roman = DigitType.determine(i + 1).getStringFor(currentDigit) + roman;
		}
		return roman;

	}

}
