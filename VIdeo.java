
public class VIdeo extends MediaItem {

    private String director;
    private String genre;
    private int year;
    public VIdeo(String director, String genre,int  year) {
    	
    	this.director=director;
    	this.genre=genre;
    	this.year=year;
    }
    
	public void GettingDetails() {
		System.out.println("THis is the overridden methodfrom Item");
	}
	public void DisplayDetails() {
		System.out.println("THis is the overridden method from Item");
	}
	public void videoQuality() {
		System.out.println("this will show the videoo quality of mediaItEM");
	}
	public void cDQuality() {
		System.out.println("this will show the CD quality of mediaItEM");
	}
	

}
