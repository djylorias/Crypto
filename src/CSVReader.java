import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CSVReader {
    
    public double[][] readDoubleCSV(String path) throws FileNotFoundException{
        double[][] res = new double[0][0];
        BufferedReader br = new BufferedReader(new FileReader(path));

        return res;
    }

}
