/*
 * [A]96
 * [TA's Advise]
 * 1. 感覺弟弟你有在進步, 很棒!
 * 2. 小地方需要去注意!
 * */

package grade;

import javax.swing.JOptionPane;

public class GradeAnalzerTester {
	public static void main(String[] args) {
		// new object
		GradeAnalyzer GA = new GradeAnalyzer();

		// set input
		while (true) {
			// GUI
			String inputnumber = JOptionPane.showInputDialog(null, "input number");

			// string compare
			// 用equalsIgnoreCase, 否則你要判斷大小寫, -2.
			if (inputnumber.equals("q")) {
				// call method
				// 缺少判斷是否合法數字<2, -2.
				GA.analyzerGrade();
				System.out.println(GA.toString());
				break;
			} else {
				// call method
				GA.isValidGrade(Double.parseDouble(inputnumber));
				GA.addGrade(Double.parseDouble(inputnumber));
			}
		}
	}
}
