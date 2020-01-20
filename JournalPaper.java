
public class JournalPaper extends WrittenItem {

	private int yearPublished;
	public void GettingDetails() {
		System.out.println("THis is the overridden methodfrom WriitenItem");
	}
	public void DisplayDetails() {
		System.out.println("THis is the overridden method from WrittenItem");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JournalPaper jp=new JournalPaper();
		jp.GettingDetails();
		jp.DisplayDetails();

	}

}
