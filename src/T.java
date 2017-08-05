import java.util.*;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAABNN";
		Set<String> r = new HashSet<>();
		bt(r, s, "");
		System.out.println(r);
	}
	
	private static void bt(Set<String> r, String s, String cur) {
		if (s.equals("")) {
			return;
		}
		char[] t = s.toCharArray();
		Arrays.sort(t);
		String x = String.valueOf(t);
		if (!r.contains(x)) {
			r.add(x);
		}
		else {
			return;
		}
		StringBuilder sb = new StringBuilder(cur);
		for (int i = 0; i < t.length; i++) {
			sb.append(t[i]);
			bt(r, new StringBuilder(s).deleteCharAt(i).toString(), sb.toString());
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
