package fr.diginamic.utils;

/**
 * Classe qui fournit des services de traitements de chaines de caractères
 * @author DIGINAMIC
 */
public final class StringUtils {
	/**
	 * Retourne la distance de Levenshtein entre 2 chaines de caractères
	 * @param chaine 1
	 * @param chaine 2
	 * @return distance
	 */
	public static int levenshteinDistance(CharSequence chaine1, CharSequence chaine2) {
		if (chaine1 == null || chaine2 == null) {
			return -1;
		}
		int longueurChaine1 = chaine1.length() + 1;
		int longueurChaine2 = chaine2.length() + 1;
		int[] cost = new int[longueurChaine1];
		int[] newcost = new int[longueurChaine1];
		for (int i = 0; i < longueurChaine1; i++) {
			cost[i] = i;
		}
		for (int j = 1; j < longueurChaine2; j++) {
			newcost[0] = j;
			for (int i = 1; i < longueurChaine1; i++) {
				int match = (chaine1.charAt(i - 1) == chaine2.charAt(j - 1)) ? 0 : 1;
				int costReplace = cost[i - 1] + match;
				int costInsert = cost[i] + 1;
				int costDelete = newcost[i - 1] + 1;
				newcost[i] = Math.min(Math.min(costInsert, costDelete), costReplace);
			}
			int[] swap = cost;
			cost = newcost;
			newcost = swap;
		}
		return cost[longueurChaine1 - 1];
	}
}
