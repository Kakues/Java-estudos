public class User {

    public static void main(String[] args) throws Exception {
        
        TvSmart smartTV = new TvSmart();

        System.out.println("TV On? "+ smartTV.on);
        System.out.println("Actual Channel: "+smartTV.channel);
        System.out.println("Actual Volume: "+smartTV.volume);
        System.out.println("");


        smartTV.turnOn();
        System.out.println("TV On? "+ smartTV.on);

        smartTV.volumeUp();
        System.out.println("Actual Volume: "+smartTV.volume);

        smartTV.changeChannel(24);
        System.out.println("Actual Channel: "+smartTV.channel);
    }
}