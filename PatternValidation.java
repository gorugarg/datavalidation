import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatternValidation {
	public static boolean matchPattern (String stringToMatch, String patternToValidate)
	{
		
		String text    = stringToMatch;

	        String patternString = patternToValidate;

	        Pattern pattern = Pattern.compile(patternString);

	        Matcher matcher = pattern.matcher(text);
	        boolean matches = matcher.matches();
	        return matches;
		
		
	}
	


}
