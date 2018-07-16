package code;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
	public int countLine() {
		String FILENAME = "C:\\Users\\Nay\\Desktop\\JavaDemo\\JavaLogic\\file.txt";
		BufferedReader br = null;
		FileReader fr = null;
		int lineCount = 0;
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			while ((br.readLine()) != null) {
				lineCount += 1;
			}
		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
		return lineCount;
	}
}
