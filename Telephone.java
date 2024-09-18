public class Telephone extends Sound {

    public Telephone(int loudness) {

        super("Telephone" , loudness);
    }

    public String toString() {

        return "type: " + getType() + " | loudness: " + getLoudness();

    } 
}