package my_first_java_project;

public class App {
	public static void main(String[] args) {

		App app = new App();
		// Given 2 Integer values greater than 0, return whichever value is closest to
		// 21 without going over 21. If they both go over 21 then return 0;

		// System.out.println(blackJack(13, 12));

		System.out.println(app.input(1, 2, 1));

		for(int i =0; i<5;i++) {
			System.out.println(i);
		}
	}

	public int input(int first, int second, int third) {
		if (first == second && first == third && second == third) {
			return 0;
		} else if (first != second && first != third && second != third) {
			return first + second + third;
		} else if (first == second) {
			return third;
		} else if (first == third) {
			return second;
		} else if (second == third) {
			return first;
		}
		return 0;
	}


}
