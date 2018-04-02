package labs_java.lab5;

public class ComputersFactory {
    public Computer getComputerFromFactory(String frequencyProcessor, String ram, String videoCard){
        return new Computer(frequencyProcessor, ram, videoCard);
    }
}
