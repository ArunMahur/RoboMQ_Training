
public class CD  extends  MediaItem{

	private String artist;
	private String genre;
	
	public CD(String artist, String genre) {
		this.artist=artist;
		this.genre=genre;
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
