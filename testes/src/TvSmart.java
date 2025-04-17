public class TvSmart {
    
    Boolean on = false;
    int channel = 2;
    int volume = 10;
    
    public void turnOn(){
        on=true;
    }    
    
    public void turnOff(){
        on=false;
    }

    public void channelUp(){
        channel++;
    }

    public void channelDown(){
        channel--;
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }
    
    public void volumeUp(){
        volume++;
    }
    
    public void volumeDown(){
        volume--;
    }


}
