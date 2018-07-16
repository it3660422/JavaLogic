import code.LeftTriangle;
import code.ReadLine;
import code.RightTriangle;

public class mainLogic {

	public static void main(String[] args) {
		// ReadLine
		int lineCnt = new ReadLine().countLine();
		System.out.println(lineCnt);
		// findFirstIndex
//		String output = new FindFirstIndex().findFirstIndex("Test");
//		System.out.println("Output= " + output);
		new LeftTriangle().leftTriangle();
		new RightTriangle().rightTriangle();
	}
}
