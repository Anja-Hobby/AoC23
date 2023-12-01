package Basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatching {

	
	public static String firstAppearance(String str, String patternString, boolean output) {
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher= pattern.matcher(str);
		if(!str.isEmpty() && matcher.find()) {
			return matcher.group();
		} else if (output) {
			System.out.println("String:\'"+str+"\' does not contain any pattern of type " + patternString);
		}
		return "";
	}
	
	public static String firstAppearance(String str, String pattern) {
		return firstAppearance(str, pattern, false);
	}
	
	public static String lastAppearance(String str, String patternString, boolean output) {
        Pattern pattern = Pattern.compile(patternString);
        String lastMatch = "";
        while (str.length()>0) {
        	 Matcher matcher = pattern.matcher(str);
        	 if (matcher.find()) {
        		 lastMatch =matcher.group();
        	 }
        	 str= str.substring(1);
        }
      
        if (!lastMatch.equals("")) {
            return lastMatch;
        } else if (output) {
            System.out.println("String:\'" + str + "\' does not contain any pattern of type " + patternString);
        }
        return "";
	}
	
	public static String lastAppearance(String str, String pattern) {
		return lastAppearance(str, pattern, false);
	}
}
