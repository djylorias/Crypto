package test;

import static org.junit.Assert.assertEquals;

import main.CSVReader;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class CSVReaderTest {

    String sep = File.separator;
    String path = "assets"+sep+"test"+sep+"testCSVReader.csv";
    
    @Test
    public void testReadDoubleCSV() throws IOException{

        try {
        double[][] res = CSVReader.readDoubleCSV(path);
        double[][] rightRes = new double[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                assertEquals(res[i][j], rightRes[i][j], 0);
            }
        }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
