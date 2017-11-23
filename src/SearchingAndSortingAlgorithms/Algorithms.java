package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0; // <- this needs changing
	}

	public static Object countPearls(List<Boolean> oysters) {

		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			// if(peeps.get(i))
		}
		return 0;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = i + 1; j < results.size(); j++) {
				if (results.get(i) > results.get(j)) {
					double temp = results.get(i);
					results.set(i, results.get(j));
					results.set(j, temp);
				}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int m = i + 1; m < unsortedSequences.size(); m++) {
				if (unsortedSequences.get(i).length() > unsortedSequences.get(m).length()) {
					String bg = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(m));
					unsortedSequences.set(m, bg);

				}
			}
		}
		return unsortedSequences;
	}
}
