package labs_java.lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ComputersReader {
    private Scanner sc;
    private ComputersFactory computersFactory;

    public ComputersReader(String fileName, ComputersFactory computersFactory) {
        this.computersFactory = computersFactory;
        String fullFileName = Util.DIR + fileName + Util.EXT_CSV;
        try {
            sc = new Scanner(new File(fullFileName));
        } catch (FileNotFoundException e) {
            System.out.println(String.format(Util.FILE_NOT_FOUND_FORMAT, fullFileName));
            closeReader();
            System.exit(0);
        }
    }

    public boolean hasResult() {
        return sc.hasNextLine();
    }
    public Computer nextResult()  {
        String[] lineData = sc.nextLine().split(Util.CSV_SEPARATOR);
        String frequencyProcessor = lineData[Util.INDEX_FREQUENCY];
        String ram = lineData[Util.INDEX_RAM];
        String videoCard = lineData[Util.INDEX_VIDEO];

        return computersFactory.getComputerFromFactory(frequencyProcessor, ram, videoCard);
    }

    public List<Computer> loadComputerList(){
        List<Computer> list= new ArrayList<>();
        while(hasResult()){
            Computer computer = nextResult();
            list.add(computer);
        }
        return list;
    }

    public void closeReader() {
        if (sc != null) {
            sc.close();
        }
    }

}
