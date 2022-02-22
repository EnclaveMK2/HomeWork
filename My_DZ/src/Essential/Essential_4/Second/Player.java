package Essential.Essential_4.Second;

public class Player implements Playable, Recordable{
    String option;
    Player(String command) {
        if (command.equals("play")) {
            this.option = "Playing";
        } else {
            this.option = "Recording";
        }
     }
    @Override
    public void play() {
        System.out.println("Playing is started");
    }

    @Override
    public void record() {
        System.out.println("Recording is started");
    }

    @Override
    public void pause() {
        System.out.println(option + " is paused");
    }

    @Override
    public void stop() {
        System.out.println(option + " is stopped");
    }
}
