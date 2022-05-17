package pack1;

public class CricketScore {
	static void score(int one,int two,int three,int four,int six) {
		System.out.println(one+2*two+3*three+4*four+6*six);
	}
	public static void main(String[] args) {
		score(1,1,1,1,2);
	}
}
