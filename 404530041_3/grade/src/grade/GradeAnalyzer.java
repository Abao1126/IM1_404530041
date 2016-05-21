package grade;

import java.lang.Math;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GradeAnalyzer {

	// new ArrayList and Array
	ArrayList<Double> ScoreList = new ArrayList<Double>();
	String[] GD = new String[11];
	int[][] Atrcnt = new int[4][3];

	// declare variable
	int counter = 0;
	double sum1, sum2, xi2, average, SD = 0;

	// check if the number is valid
	Boolean isValidGrade(double agrade) {
		if (0 <= agrade && agrade <= 110)
			return true;
		return false;
	}

	// put the valid number into ArrayList
	void addGrade(double agrade) {
		if (isValidGrade(agrade)) {
			ScoreList.add(agrade);
		}
	}

	// count average SD and grade distribution
	void analyzerGrade() {
		// count sun
		for (double score : ScoreList) {
			sum1 += score;
		}
		// count average
		counter = ScoreList.size();
		average = sum1 / counter;

		// count sum of the square
		for (double score : ScoreList) {
			xi2 = Math.pow(score, 2);
			sum2 += xi2;
		}
		// count SD
		SD = Math.sqrt(sum2 / counter - Math.pow(average, 2));

		// grade distribution
		for (double score : ScoreList) {
			if (score <= 110 && score >= 98) {
				GD[0] = "A+";
				Atrcnt[0][0]++;
			} else if (score < 98 && score >= 92) {
				GD[1] = "A";
				Atrcnt[0][1]++;
			} else if (score < 92 && score >= 90) {
				GD[2] = "A-";
				Atrcnt[0][2]++;
			} else if (score < 90 && score >= 88) {
				GD[3] = "B+";
				Atrcnt[1][0]++;
			} else if (score < 88 && score >= 82) {
				GD[4] = "B";
				Atrcnt[1][1]++;
			} else if (score < 82 && score >= 80) {
				GD[5] = "B-";
				Atrcnt[1][2]++;
			} else if (score < 80 && score >= 78) {
				GD[6] = "C+";
				Atrcnt[2][0]++;
			} else if (score < 78 && score >= 72) {
				GD[7] = "C";
				Atrcnt[2][1]++;
			} else if (score < 72 && score >= 70) {
				GD[8] = "C-";
				Atrcnt[2][2]++;
			} else if (score < 70 && score >= 60) {
				GD[9] = "D";
				Atrcnt[3][0]++;
			} else if (score < 60 && score >= 0) {
				GD[10] = "F";
				Atrcnt[3][1]++;
			}
		}
	}

	// output the result
	public String toString() {
		String rst = "Please try again !!!";
		// check if there are at least two valid input
		if (ScoreList.size() < 2) {
			JOptionPane.showMessageDialog(null,
					"You did not enter enough grades to analyze. Please enter at least 2 valid grades ");
		} else {
			rst = "You entered\t" + counter + "\tvalid grades from 0 to 110.\n " + "Invalid grades are ignored!\n"
					+ "The average = " + average + "with a standard deviation " + SD
					+ "\nThe grade distribution is:\n\n" + "A+ =" + Atrcnt[0][0] + "\nA =" + Atrcnt[0][1] + "\nA- ="
					+ Atrcnt[0][2] + "\nB+ =" + Atrcnt[1][0] + "\nB =" + Atrcnt[1][1] + "\nB- =" + Atrcnt[1][2]
					+ "\nC+ =" + Atrcnt[2][0] + "\nC =" + Atrcnt[2][1] + "\nC- =" + Atrcnt[2][2] + "\nD ="
					+ Atrcnt[3][0] + "\nF =" + Atrcnt[3][1];
		}
		return rst;
	}
}
