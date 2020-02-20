
public class TimerRecursion {

	public static void Timer(int min, int sec) {
		if (min == 0 && sec == 0) {
			System.out.println("Time out");
			return;
		} else if (min != 0 && sec == 0) {
			System.out.println(min + ":" + sec);
			Timer(min - 1, 59);
		} else {
			System.out.println(min + ":" + sec);
			Timer(min, sec - 1);
		}
	}

	public static void main(String[] args) {
		Timer(2, 44);
	}

}
