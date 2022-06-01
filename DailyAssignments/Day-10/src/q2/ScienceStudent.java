package q2;

public class ScienceStudent extends Student {
int physicsMarks;
int chemistryMarks;
int mathsMarks;
@Override
public float getPercentage() {
	// TODO Auto-generated method stub
	float total= this.chemistryMarks+ this.mathsMarks+ this.physicsMarks;
	float per= (total*100)/300;
	return per;
	//return (total/300)*100;
}

}
