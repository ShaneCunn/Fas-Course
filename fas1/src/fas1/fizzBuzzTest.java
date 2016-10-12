package fas1;

public class fizzBuzzTest {

	public static void main(String[] args) {

		//System.out.println("test output");

		for (int i = 1; i <= 50; i++) {

			if (i % 15 == 0) {

				System.out.println("FizzBuzzWoof " + i);
			}

			else if (i % 3 == 0) {

				System.out.println("fizz " + i);

			} else if (i % 5 == 0) {

				System.out.println("buzz " + i);
			}

			else if (i % 7 == 0) {

				System.out.println("woof " + i);

			}

			else {
				System.out.println(i);
			}
		}

	}

}
