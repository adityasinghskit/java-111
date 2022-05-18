package pack1;

public class VowelCons {
	void check(char c) {
		char v[]= {'a','e','i','o','u','A','E','I','O','U'};
		if(c>='a' && c<='z' || c>='A' && c<='Z') {
			/*if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' ||
					c=='E' || c=='I' || c=='O' || c=='U') {
				System.out.println("Character is vowel!");
			}*/
			boolean flag=false;
			for(char el:v) {
				if(c==el) {
					System.out.println("Character is vowel!");
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println("Character is consonent!");
			}
		}else {
			System.out.println("Not a charcter!");
		}
	}
	public static void main(String[] args) {
		VowelCons v1= new VowelCons();
		v1.check('b');
	}
	
}
