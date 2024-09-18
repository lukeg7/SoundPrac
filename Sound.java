public class Sound {

    public String type;
    public int loudness; 

    public Sound(String type, int loudness) {
        this.type = type;
        this.loudness = loudness;

    }

    public String toString() {

        return "type: " + type + " | loudness: " + loudness;

    } 

    protected String getType() {
        return type;

    }

    protected int getLoudness() {
        return loudness;

    }

    





}