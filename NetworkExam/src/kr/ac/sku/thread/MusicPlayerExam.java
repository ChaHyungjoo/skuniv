package kr.ac.sku.thread;

public class MusicPlayerExam {

	public static void main(String[] args) {
		MusicBox musicBox = new MusicBox();
		
		MusicPlayer cha = new MusicPlayer(1, musicBox);
		MusicPlayer kim = new MusicPlayer(2, musicBox);
		MusicPlayer kang = new MusicPlayer(3, musicBox);
		
		cha.start();
		kim.start();
		kang.start();
		
	}

}
