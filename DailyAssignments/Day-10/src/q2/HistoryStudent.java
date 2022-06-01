package q2;

public class HistoryStudent extends Student {
int historyMarks;
int civicsMarks;
@Override
public float getPercentage() {
	float total=this.civicsMarks+ this.historyMarks;
	float per= (total*100)/200;
	return per;
	//return (total/200)*100;
}

}
