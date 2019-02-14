package array;

public class pairingArrayElements {
	public static int pair = 0;
	public static int sum;

	public static void main(String[] args) {
		int[] array = new int[] { };
		int[] array1 = new int[0];

		int pair=pairingArrayElements.getpairs(array, array.length);
		System.out.println("The Number of Pairs is "+ pair);

	}

	public static int getpairs(int[] A, int n) {

		boolean flag = true;
       /*
        * Sort the Array
        */
		while (flag) {

			flag = false;

			for (int i = 0; i < A.length - 1; i++) {
				int temp = 0;
				if (A[i] > A[i + 1]) {
					temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
					flag = true;
				}

			}

		}
        
		System.out.println("SORTED ARRAY");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");

		}
		System.out.println();

		int pair = 0;
		int sum = 1;
		int i = 0;
		boolean flag1 = true;
		while (flag1) {
			if (A.length<=1) {
				pair += sum / 2;
				sum = 1;
				i++;
				break;
			}


			if (A[i] == A[i + 1]) {
				sum += 1;
				i++;
			} else {
				pair += sum / 2;
				sum = 1;
				i++;
			}

			if (i == A.length - 1) {
				pair += sum / 2;
				sum = 1;
				i++;
				break;
			}

		}


		return pair;
	}

}
