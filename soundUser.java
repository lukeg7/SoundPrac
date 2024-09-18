public class soundUser {
    public static void main(String[] args) {
        // Create instances of each sound type
        Sound alarm = new Alarm(70, 5);
        Sound telephone = new Telephone(50);
        Sound howl = new Howl();

        // Print the sounds using toString() method
        System.out.println(alarm.toString());
        System.out.println(telephone.toString());
        System.out.println(howl.toString());

        // Call the getType and getLoudness methods for practice
        System.out.println("Alarm type: " + alarm.getType());
        System.out.println("Telephone type: " + telephone.getType());
        System.out.println("Howl type: " + howl.getType());

        System.out.println("Alarm loudness: " + alarm.getLoudness());
        System.out.println("Telephone loudness: " + telephone.getLoudness());
        System.out.println("Howl loudness: " + howl.getLoudness());
    }
}
