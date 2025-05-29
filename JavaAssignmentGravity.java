import java.util.ArrayList;
import java.util.Arrays;

public class JavaAssignmentGravity {
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50, 50, 60 };

		Arrays.sort(numbers);
		ArrayList<Integer> discount = new ArrayList<>();
		ArrayList<Integer> payable = new ArrayList<>();
		for (int i = numbers.length - 1; i > 0; i -= 2) {

			discount.add(numbers[i - 1]);
			payable.add(numbers[i]);
		}

		if (numbers.length % 2 != 0) {
			payable.add(numbers[0]);
		}

		System.out.println("Discounted Items(Free):" + discount + "\n" + "Payable Items:" + payable + "\n");
	}
}
