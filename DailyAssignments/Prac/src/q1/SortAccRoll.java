package q1;

import java.util.Comparator;

public class SortAccRoll implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getRollNo()>s2.getRollNo()) {
			return 1;
		}else if(s1.getRollNo()<s2.getRollNo()) {
			return -1;
		}else {
			return 0;
		}
	}

}
