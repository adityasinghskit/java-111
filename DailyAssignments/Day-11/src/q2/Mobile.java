package q2;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
public void searchOutdatedModel(String name, String... model){
	for(String m: model) {
		for(String o: outdatedModels) {
			if(m.equals(o)) {
				System.out.println(m+" OUTDATED");
			}
		}
	}
} 
public static void main(String[] args) {
	Mobile m1= new Mobile();
	m1.searchOutdatedModel("Nokia","note4","note5", "9023");
	
}
}
