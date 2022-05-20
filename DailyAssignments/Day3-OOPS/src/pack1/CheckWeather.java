package pack1;

public class CheckWeather {
	static void check(boolean snow, boolean rain, double temp) {
		if(snow || rain || temp<50 ) {
			System.out.println("Let’s stay home.");
		}else {
			System.out.println("Let’s go out!");
		}
	}
	public static void main(String[] args) {
		check(false,false,51);
	}
}
