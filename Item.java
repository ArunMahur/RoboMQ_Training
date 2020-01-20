import java.util.Scanner;

public abstract class Item {

	private int IdNum;
	private String title;
	private int CopyCount=0;
	public Item() {
		System.out.println("This is constructor of superclass Item");
	}
	
    public void GettingDetails() {
	 
    	Scanner sc=new Scanner(System.in);
    	IdNum=sc.nextInt();
    	title=sc.next();
    	CopyCount=CopyCount+1;
    }
    public void DisplayDetails() {
    	System.out.println(IdNum);
    	System.out.println(title);
    	System.out.println(CopyCount);
    }
    public abstract void getters();
    
    public abstract void setters();

	public void getters(String name) {
		// TODO Auto-generated method stub
		
	}
}
