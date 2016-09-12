package day03;

class TV{
	int channel;
	int volume;
	boolean power;
	
	public void channelUp()
	{
		this.channel = channel++;
	}
	public void channelDown()
	{
		this.channel = channel--;
	}
	public void volumeUp()
	{
		this.volume = volume++;
	}
	public void volumeDown()
	{
		this.volume = volume--;
	}
	public void powerOn()
	{
		this.power = true;
		System.out.println("ON");
	}
	public void powerOff()
	{
		this.power = false;
		System.out.println("OFF");
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public boolean isPower(){
		if(power){
			powerOn();
		}
		else powerOff();
		return power;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}


public class WatchTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		tv.setChannel(7);
		tv.setVolume(20);
		tv.power = false;
		
		System.out.println("채널: "+tv.getChannel()+", 볼륨: "+tv.getVolume()+", 전원상태: "+tv.isPower());
		
		
		
		

	}

}
