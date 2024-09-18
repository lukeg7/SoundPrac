public class Alarm extends Sound {

    public int snoozeTime;

    public Alarm(int loudness, int snoozeTime) {

        super("Alarm" , loudness);
        this.snoozeTime = snoozeTime;
    }
    
    public String toString() {

        return super.toString() + "| snoozeTime: " + snoozeTime; 

    } 
}