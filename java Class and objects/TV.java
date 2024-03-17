
public class TV {
       int channel = 1;
       int volume  = 1;
       boolean on = false;
    public static void main(String[] args) { 
        TV tv1 = new TV(); 
        tv1.setChannel(30);
        tv1.setVolume(6);
        tv1.turnOn();
        tv1.turnOf();
        tv1.channelUp();
        tv1.channelDown();
         System.out.println("tv1's channel is " + tv1.channel+ 
         " and volume level is " + tv1.volume);
         System.out.println("tv1 is on");
         tv1.turnOn(); 
         System.out.println("tv1's channel and volume was ");
         System.out.print(tv1.channel+" "+tv1.volume);
    }

    public TV(){
    }
    public void turnOn(){
        on = true;
    }
    public void turnOf(){
        on = false;
    }   
    public void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    } 
    public void setVolume(int newVolumeLevel){
        if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7){
            volume = newVolumeLevel;
        }
    }
    public void channelUp(){
        if(on && channel < 7)
            channel++;
    }
    
    public void channelDown(){
        if(on && channel > 1)
            channel--;
    }
    public void volumeDown(){
        if(on && volume > 1)
            volume--;
    }
    public void volumeUp(){
        if(on && volume < 7)
            volume++;
    }
}