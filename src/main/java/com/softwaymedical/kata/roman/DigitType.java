package com.softwaymedical.kata.roman;

public enum DigitType {
	UNIT("I", "V", "X"), //
	DECADE("X", "L", "C"), //
	HUNDRED("C", "D", "M"), //
	THOUSAND("M", "", "");

	private static final String EMPTY = "";
	private final String lowerChar;
	private final String middleChar;
	private final String higherChar;

	private DigitType(String lowerChar, String middleChar, String higherChar) {
		this.lowerChar = lowerChar;
		this.middleChar = middleChar;
		this.higherChar = higherChar;
	}

	public static DigitType determine(int digitPosition) {
		return DigitType.values()[digitPosition - 1];
	}

	public String getStringFor(Integer digitValue) {
		switch (digitValue) {
			case 1:
				return lowerChar;
			case 2:
				return lowerChar + lowerChar;
			case 3:
				return lowerChar + lowerChar + lowerChar;
			case 4:
				return lowerChar + middleChar;
			case 5:
				return middleChar;
			case 6:
				return middleChar + lowerChar;
			case 7:
				return middleChar + lowerChar + lowerChar;
			case 8:
				return middleChar + lowerChar + lowerChar + lowerChar;
			case 9:
				return lowerChar + higherChar;
			default:
				return EMPTY;
		}
	}

}
