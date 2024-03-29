public class StaticTask {
	public static int sum(int arg1, int arg2, int arg3) {
		return arg1 + arg2 + arg3;
	}

	public static int sumArrayValues(int[] myArray) {
		int sum = 0;
		for (int arg : myArray) {
			sum = sum + arg;
		}
		return sum;
	}

	public static void printOut(int[] myArray) {
		for (int arg : myArray) {
			System.out.print(arg + " ");
		}
	}

	public static void main(String[] args) {
		int sum = sum(1, 2, 3);
		System.out.println(sum);
		int[] data = new int[4];
		System.out.println(sumArrayValues(data));
		printOut(data);
	}
}