package Basic;

public class stringEditor {
	
	public static int stringToNum(String string) {
		switch (string) {
		case "one":
			return 1;
		case "two":
			return 2;
		case "three":
			return 3;
		case "four":
			return 4;
		case "five":
			return 5;
		case "six":
			return 6;
		case "seven":
			return 7;
		case "eight":
			return 8;
		case "nine":
			return 9;
		case "zero":
			return 0;
		}
		System.out.println(" Je ingegeven string was incorrect (namelijk: ) " + string);
		return 0;
	}

}
