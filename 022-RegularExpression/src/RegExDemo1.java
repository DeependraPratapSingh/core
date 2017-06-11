import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Jul 19, 2016,11:34:45 PM,
 */

/**
 * @author DnZdP
 *
 */
public class RegExDemo1 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abababbaab");
		while (m.find()) {
			System.out.println(m.start()+"...."+m.end()+"...."+m.group());
		}
	}
}
