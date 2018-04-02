package labs_java.lab5;

import java.text.SimpleDateFormat;
import java.util.Comparator;

public class Util {
    public static final SimpleDateFormat DF_HYPHEN = new SimpleDateFormat("yyyy-mm-dd");
    public static final SimpleDateFormat DF_DOT = new SimpleDateFormat("dd.mm.yyyy");

    public static final String CSV_SEPARATOR = ";";
    public static final String DIR = "src/";
    public static final String EXT_CSV = ".csv";
    public static final String FILE_NOT_FOUND_FORMAT = "File %s not found";

    public static final int INDEX_FREQUENCY = 0;
    public static final int INDEX_RAM = 1;
    public static final int INDEX_VIDEO = 2;


    public static <E> Comparator<E> compare() {
        return (e1, e2) -> 0;
    }
}
