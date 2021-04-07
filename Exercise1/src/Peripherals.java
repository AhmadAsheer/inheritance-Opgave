public abstract class Peripherals {

    //I create 3 variables which all mice has
    private String shape;
    private String color;
    private int weight;

    //Here i create an abstract method called "feature" which is a unique feature a given mouse has
    public abstract void Feature();

    //Here i create my operator which contains the variables and prints the input out
    public void mouse (String shape, String color, int weight){
        this.shape = shape;
        this.color = color;
        this.weight = weight;
        System.out.println("Mouse shape: " + this.shape);
        System.out.println("Mouse color: " + this.color);
        System.out.println("Mouse weight: " + this.weight + "g");


    }

}
