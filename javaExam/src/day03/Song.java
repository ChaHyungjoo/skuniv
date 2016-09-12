package day03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public void show(){
		System.out.println(this.getArtist()+" "+this.getTitle()+"("+this.getAlbum()+", "+this.getYear()+", "+this.getTrack()+"번 track, "+this.getComposer()+" 작곡)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song();
		
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
		
		//System.out.println(song.getArtist()+song.getTitle()+"("+song.getArtist()+", "+song.getYear()+", "+song.getTrack()+"번 track, "+song.getComposer()+" 작곡)");
		
		

	}

}
