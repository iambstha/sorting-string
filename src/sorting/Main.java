package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	// The Unicode interpretation by java compiler seems to not detect the unicode character code that is
	// written inside the string literal. So this solution might not be the best way to solve this question.
	// But for the sake of this task, I have provided a solution but this might not be the best solution.
	// If there is any better way to do this, I would be more that happy to learn.

	public static void main(String[] args) {
		String[] qArray = { "xL01(F]J", "2pn5Mm", "-5)8gF{", "KWq0P]*%Q", "n@,:\u003eAm@", "\u003cRN_qCa7",
				"8Qx\u0026RAON", "gT~s!1s?4i{K", "w\"r^d_#l$Mmp" };
		List<String> aList = new ArrayList<>();
		List<String> qList = Arrays.asList(qArray);
		qList.forEach(qString -> {
			String sorted = sortedString(qString);
			String replacedAndSorted = replaceWithUnicode(sorted);
			aList.add(replacedAndSorted);
		});
		System.out.println(Arrays.toString(aList.toArray()));
	}

	public static String sortedString(String str) {
		char[] c = str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

	public static String replaceWithUnicode(String str) {
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (ch == '\u0026' || ch == '\u003c' || ch == '\u003e') {
				sb.append(String.format("\\u%04x", (int) ch));
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
