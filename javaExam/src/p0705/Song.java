package p0705;

//class Song{
//	public String title;
//	public Song(String title){
//		this.title = title;
//	}
//	public String getTitle() {
//		return title;
//	}
//	
//}

public class Song {
	public String title;
	public Song(String title){
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song mySong = new Song("Let it go");
		Song yourSong = new Song("������Ÿ��");
		System.out.println("�� �뷡�� "+mySong.getTitle());
		System.out.println("�� �뷡�� "+yourSong.getTitle());

	}

}
