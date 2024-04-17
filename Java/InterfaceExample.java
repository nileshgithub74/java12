class Phone{
    public void call(){
        System.out.println("Phone call");

    }
    public void sms(){
        System.out.println("Phone sending sms");
    }
}

interface Icamera{
    void click();
    void record();
}
interface ImusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements Icamera, ImusicPlayer{
    public void videoCall(){
        System.out.println("Smart phone video call");

    }
    public void click(){
        System.out.println("Smart phone clicking photos");
    }
    public void record(){
        System.out.println("Smart phone recording video");
    }
    public void play(){
        System.out.println("smart phone playing music");
    }
    public void stop(){
        System.out.println("smart phone stoped playing music");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.click();
        sp.play();
    }


    
}
