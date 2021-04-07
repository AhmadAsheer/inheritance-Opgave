public class Main {
    public static void main(String[] args) {

        //Here i create a new mouse (logitech) and i give it its attributes
        Mouse1 logitech = new Mouse1();
        logitech.mouse("Semi-ambidextrous","Black",60);
        //Now i can also call the feature i gave it
        logitech.Feature();

        System.out.println("");

        // i do the same thing here
        Mouse2 razer = new Mouse2();
        razer.mouse("Ergonomic","Mercury White",82);
        razer.Feature();

    }
}
