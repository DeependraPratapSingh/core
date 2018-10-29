package Pack1;

public class Prog12WordsInString {
	public void countWorld(String str) {
		String[] words = str.split(",");
		int count = 1;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count = count + 1;
					words[j] = "0";
				}
			}
			if (words[i] != "0")
				System.out.println(words[i] + "--" + count);
			count = 1;
		}
	}

	public static void main(String[] args) {
		Prog12WordsInString p1 = new Prog12WordsInString();
		String s1 = "Welcome,to,to,java,world,world";
		p1.countWorld(s1);
	}
}
