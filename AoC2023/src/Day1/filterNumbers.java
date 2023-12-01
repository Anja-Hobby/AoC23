package Day1;

import java.util.ArrayList;
import Basic.AoCReader;
import Basic.patternMatching;
import Basic.stringEditor;

public class filterNumbers {

	AoCReader reader = new AoCReader();
	static patternMatching pm = new patternMatching();
	static stringEditor strEdit = new stringEditor();

	public static void main(String[] args) {
		ArrayList<String> input;
		try {
			input = AoCReader.read("C:\\Users\\anjac\\OneDrive\\Desktop\\challenges\\AoC2023\\aoc01.txt");
			System.out.println(""+input);
			int sumWritten = 0;
			int sumOnlyNumbers =0;
			for (String str: input) {
				if (str.length()>0) {
				sumWritten= sumWritten + getFirstAndLastWritten(str);
				sumOnlyNumbers = sumOnlyNumbers + getFirstAndLast(str);
				}
			}
			System.out.println("sumWritten = " + sumWritten);
			System.out.println("sumOnlyNumbers = " + sumOnlyNumbers);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	private static int getFirstAndLast(String str) {
		int firstDigit = 0;
		int lastDigit = 0;

		String firstString= patternMatching.firstAppearance(str, "\\d");
		String lastString= patternMatching.lastAppearance(str, "\\d");

		//System.out.println(str+ " resulted in : " + firstString + "  and " + lastString);
		
		if (firstString.length()==1) {
		firstDigit = Integer.parseInt(firstString);
		lastDigit = Integer.parseInt(lastString);
		}

		
		int TotalValue = 10*firstDigit+lastDigit;
		//System.out.println("String " + str + " resulted in " + TotalValue);
		return TotalValue;
	}
	/**
	 * Returns the firstNumberWritten*10 + lastNumberWritten*1
	 * @param str
	 * @return
	 */
	private static int getFirstAndLastWritten(String str) {
		int firstDigit = 0;
		int lastDigit = 0;

		String firstString= patternMatching.firstAppearance(str, "\\d|one|two|three|four|five|six|seven|eight|nine|zero");
		String lastString= patternMatching.lastAppearance(str, "\\d|one|two|three|four|five|six|seven|eight|nine|zero");

		if (firstString.length()>1) {
			firstDigit = stringEditor.stringToNum(firstString);
		} else if (firstString.length()==1) {
			firstDigit = Integer.parseInt(firstString);
		} else {
			System.out.println(" String " + str + " has no pattern of type " + "\\d|one|two|three|four|five|six|seven|eight|nine|zero");
		}

		if (lastString.length()>1) {
			lastDigit = stringEditor.stringToNum(lastString);
		} else if (lastString.length()==1){
			lastDigit = Integer.parseInt(lastString);
		} else {
			System.out.println(" String " + str + " has no pattern of type " + "\\d|one|two|three|four|five|six|seven|eight|nine|zero");
		}

		int TotalValue = 10*firstDigit+lastDigit;
		System.out.println("StringWritten " + str + " resulted in " + TotalValue);
		return TotalValue;
	}

}
