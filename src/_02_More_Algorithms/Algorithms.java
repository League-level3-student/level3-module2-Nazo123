package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		
	for(int i = 0; i<eggs.size();i++) {
		if(eggs.get(i).equals("cracked")) {
			return i;
		}
	}
		return -1;
	}

public static int countPearls(List<Boolean> oyster) {
	int count = 0;
	for(int i = 0; i<oyster.size();i++) {
		if(oyster.get(i)==true) {
			count++;
		}
	}
	if(count>0) {
		return count;
	}
	return -1;
	}
public static double findTallest(List<Double> peeps) {
	int a = 0;
	for(int i = 0; i < peeps.size();i++) {
		if(peeps.get(i)>peeps.get(a)) {
			a=i;
		}
	}
	return peeps.get(a);
}
public static Object findLongestWord(List<String> words) {
	int a = 0;
	for(int i = 0; i < words.size();i++) {
		if(words.get(i).length()>words.get(a).length()) {
			a=i;
		}
	}
	return words.get(a);
}

public static Object containsSOS(List<String> message1) {
	for(int i = 0; i < message1.size();i++) {
		if(message1.get(i).contains(	"... --- ...")) {
		return true;
		}
	}

	return false;

}

public static List<Double> sortScores(List<Double> results) {
	for(int a = 0; a < results.size()-1;a++) {
	for(int i = 0; i < results.size()-1;i++) {
		if(results.get(i)>results.get(i+1)) {
			double holder = results.get(i);
			results.set(i, results.get(i+1));
			results.set(i+1, holder);
		}
	}
	}
	return results;
}

public static List<String> sortDNA(List<String> unsortedSequences) {
	for(int a = 0; a < unsortedSequences.size()-1;a++) {
		for(int i = 0; i < unsortedSequences.size()-1;i++) {
			if(unsortedSequences.get(i).length()>unsortedSequences.get(i+1).length()) {
				String holder = unsortedSequences.get(i);
				unsortedSequences.set(i, unsortedSequences.get(i+1));
				unsortedSequences.set(i+1, holder);
			}
		}
		}
		return unsortedSequences;
}

public static List<String> sortWords(List<String> words) {
	for(int a = 0; a < words.size()-1;a++) {
		for(int i = 0; i < words.size()-1;i++) {
			if(words.get(i).compareTo(words.get(i+1))==1) {
				String holder = words.get(i);
				words.set(i, words.get(i+1));
				words.set(i+1, holder);
			}
		}
		}
		return words;
}




}

