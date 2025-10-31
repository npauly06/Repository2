package h2;

public class H2_main {

	public static void main(String[] args) {
		int i = 2;
		int j = 4;
		int k = 3;
		int min;
		int max;
		
		if (i<j && i<k) {
			min = i;
		} else if (j<i && j<k) {
			min = j;
		} else {
			min = k;
		}
		
		if (i>j && i>k) {
			max = i;
		} else if (j>i && j>k) {
			max = j;
		}else {
			max = k;
		}
		
		System.out.println("Wert von i: " + i);
		System.out.println("Wert von j: " + j);
		System.out.println("Wert von k: " + k);
		System.out.println("Minimum Wert: " + min);
		System.out.println("Maximum Wert: " + max);	
	}
}
