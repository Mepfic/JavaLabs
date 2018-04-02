package labs_java.lab5;

public class Computer {
    private int frequencyProcessor;
    private int ram;
    private String videoCard;
    private int performance;

    public Computer() {
    }

    public Computer(int frequencyProcessor, int ram, String videoCard) {

        this.frequencyProcessor = frequencyProcessor;
        this.ram = ram;
        this.videoCard = videoCard;
        setPerformance(frequencyProcessor, ram);
    }

    public Computer(String frequencyProcessor, String ram, String videoCard) {

        setFrequencyProcessor(frequencyProcessor);
        setRam(ram);
        this.videoCard = videoCard;
        setPerformance(this.getFrequencyProcessor(), this.getRam());
    }


    public int getFrequencyProcessor() {
        return frequencyProcessor;
    }

    public void setFrequencyProcessor(int frequencyProcessor) {
        this.frequencyProcessor = frequencyProcessor;
    }

    public void setFrequencyProcessor(String frequencyProcessor) {
        this.frequencyProcessor = Integer.parseInt(frequencyProcessor);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRam(String ram) {
        this.ram = Integer.parseInt(ram);
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }


    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int frequencyProcessor, int ram) {
        this.performance = frequencyProcessor * ram;
    }

    @Override
    public String toString() {
        return  frequencyProcessor + ";" + ram +
                ";" + videoCard + ";" + performance +";";
    }

}
