import java.util.Arrays;


public class HighScore {

	public static int [] scores = {98, 86, 75, 61, 55, 50, 40, 39, 0, 0};
	public static int numOfScores = 8; 

	public static void main(String[] args) {

		System.out.println(Arrays.toString(scores));
		System.out.println(numberExists(75));
		remove(75);
		System.out.println(Arrays.toString(scores));
		add(76);
		System.out.println(Arrays.toString(scores));
	}

	public static int numberExists (int search_param) {

		int position = -1;

		for (int j = 0; j < scores.length; j++) {
			if (scores[j] == search_param)
				position = j;	
		}

		return position;
	}

	public static void remove (int num) {

		int pos = numberExists(num);

		for (int k = pos; k < numOfScores; k++) {
			scores[k] = scores[k+1];
		}
	}
	
	public static int add (int newScore) {
		
		if (numOfScores == scores.length && scores[scores.length - 1] > newScore)
			return 0;
		else {
			int i = numOfScores - 1;
			for ( ;(i >= 1) && scores[i - 1] < newScore; i--) {
				scores[i] = scores[i-1];
			}
			scores[i] = newScore;
			if (numOfScores < scores.length) numOfScores++;
			return (i+1);
		}
	}

}
