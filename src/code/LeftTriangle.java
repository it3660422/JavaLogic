package code;

public class LeftTriangle {
	public void leftTriangle() {
		int n = 5;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				sb.append("* ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
