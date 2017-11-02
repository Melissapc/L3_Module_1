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
			if (oysters.get(i)==true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest=0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i))
		}
		return 0;
	}

	// Add other methods here
}
