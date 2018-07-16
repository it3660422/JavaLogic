package code;

public class RightTriangle {
	public void rightTriangle() {
		StringBuffer sb = new StringBuffer();
		int n = 5;
		// number of spaces
		int k = 2 * n - 2;
		// outer loop to handle number of rows
		for (int i = 0; i < n; i++) {
		   // inner loop to handle number spaces
		   for (int j = 0; j < k; j++) {
		      sb.append(" ");
		   }
		   // decrementing k after each loop
		   k = k - 2;
		   // inner loop to handle number of columns
		   for (int j = 0; j <= i; j++) {
		      sb.append("* ");
		   }
		   sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
