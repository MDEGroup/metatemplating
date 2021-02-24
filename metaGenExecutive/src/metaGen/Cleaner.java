package metaGen;

import java.util.ArrayList;
import java.util.List;

public class Cleaner {

	private static String lbr = "\n";
	private static String out_lbr = "\n";
	private String text = "";

	public static Cleaner Build() {
		return new Cleaner();
	}

	private Cleaner() {
		super();
	}

	public String getText() {
		return text;
	}

	public Cleaner setText(String text) {
		this.text = text;
		return this;
	}

	public Cleaner clean() {
		List<String> lines = new ArrayList<String>();
		List<Integer> lengths = new ArrayList<Integer>();

		// Divide the text into lines
		String text = this.text;
		while (text.length() > 0) {
			lines.add(text.substring(0, text.indexOf(lbr)));
			text = text.substring(text.indexOf(lbr) + 1);
		}

		// Calculate lines length
		for (String s : lines) {
			String t = s.trim();
			lengths.add(t.length());
		}

		// Restore lines if concat(k, k+1) is not empty
		String output = "";
		for (int k = 1; k < lengths.size(); k++) {
			if ((lengths.get(k - 1) + lengths.get(k)) > 0)
				output += lines.get(k - 1) + out_lbr;
		}
		output += lines.get(lines.size() - 1);

		this.text = output;

		return this;
	}

}
