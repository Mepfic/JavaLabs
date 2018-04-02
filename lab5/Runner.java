package labs_java.lab5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        final String FILE_IN_NAME = "in";
        final String FILE_OUT_NAME = Util.DIR+ "out"+Util.EXT_CSV;
        ComputersFactory computersFactory = new ComputersFactory();
        ComputersReader computersReader = new ComputersReader(FILE_IN_NAME, computersFactory);
        List<Computer> computers = computersReader.loadComputerList();
        computers.sort(Util.<Computer>compare().
                        thenComparing(computer -> computer.getVideoCard()).
                        thenComparing(computer -> computer.getFrequencyProcessor()).
                        thenComparing(computer -> computer.getRam())
                );
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(FILE_OUT_NAME)));
            computers.forEach(printWriter::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            printWriter.close();
        }

    }
}
