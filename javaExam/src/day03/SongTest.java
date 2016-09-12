package day03;

class Song3 {
	
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
	
	public Song3(){};
	public Song3(String title, String artist, String album, String[] composer, int year, int track){
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public Song3(String title, String artist){
		this(title, artist, "", null, 0, 0);
	}
	
	
}

public class SongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song3 song1 = new Song3();
		
		

	}

}
