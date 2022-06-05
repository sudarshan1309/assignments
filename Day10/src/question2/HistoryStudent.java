package question2;

public class HistoryStudent extends Student{

	int historyMarks;
	int civicsMarks;
	
	public int getHistoryMarks() {
		return historyMarks;
	}

	
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}

	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}

	
	public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	
	public HistoryStudent() {
		
	}
	
	@Override
	public double getPercentage() {
		double total = (this.historyMarks + this.civicsMarks);
		double per = ((total/200)*100);
		
		System.out.println("Student Name: "+ name);
		System.out.println("Student Stream: History Student");
		
		return per;
		
	}

	
}
