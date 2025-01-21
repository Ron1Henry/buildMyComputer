package BuildComputer;

import javax.management.monitor.Monitor;

public class BuildComputer {
    public static void main(String[] args) {

        String name = new String("Ricardo");
        Resolution resolution = new Resolution(3860, 1276);

        Monitor m = new Monitor("HP", "1AC",resolution,42.3);

        Dimension dMotherboard = new Dimension(1000, 1000);
        Monitor monitor = new Monitor();
        Motherboard mb = new Motherboard();
        Case theCase = new Case();
        PC myPC = new PC();
    }
}
