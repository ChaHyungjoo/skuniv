package kr.ac.sku.thread;

public class MusicBox {
	public synchronized void playMusicA(){
		for(int i=0; i<5; i++){
			System.out.println("½Å³ª´Â À½¾Ç");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public synchronized void playMusicB(){
		for(int i=0; i<5; i++){
			System.out.println("½½ÇÂ À½¾Ç");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public synchronized void playMusicC(){
		for(int i=0; i<5; i++){
			System.out.println("ÁÁÀº À½¾Ç");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	
}
