import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LiquidContainer container1 = new LiquidContainer();
        LiquidContainer container2 = new LiquidContainer();
        UserInterface ui = new UserInterface(scan, container1, container2 );
        ui.start();

    }

}
