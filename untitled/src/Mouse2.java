public class Mouse2 extends Peripherals {
    //I need to extend the Peripherals class in order to override the method

    //Here i do the same but in this case the mouse has 8k polling rate
    @Override
    public void Feature() {
        System.out.println("Feature: 8K polling rate");
    }
}
