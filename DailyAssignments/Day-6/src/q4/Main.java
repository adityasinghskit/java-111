package q4;

public class Main {
	public static int fac(int num) {
		int ans=1;
		for(int i=num;i>0;i--) {
			ans=ans*i;
		}
		return ans;
	}
	public static void main(String[] args) {
		if(args.length==1) {
			System.out.println(fac(Integer.parseInt(args[0])));
		}else if(args.length==2) {
			int diff=Math.abs(Integer.parseInt(args[0])-Integer.parseInt(args[1]));
			System.out.println(fac(diff));
		}else {
			System.out.println("Error");
		}
}
}
