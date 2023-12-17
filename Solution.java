import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n], b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
				b[i] = fs.nextInt();
			}
			int p = 0, q = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] <= 10 && b[i] > q) {
					p = i + 1;
					q = b[i];
				}
			}
			System.out.println(p);
		}
		fs.close();
	}
}
