package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import main.CSVReader;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TestCSVReader {

    String sep = File.separator;
    String path = "assets"+sep+"test"+sep+"testCSVReader.csv";
    
    @Test
    public void testReadDoubleCSV(){

        try {
            double[][] res = CSVReader.readDoubleCSV(path);
            for(int i=0;i<res.length;i++){
                for(int j=0;j<res[i].length;j++){
                    System.out.print(res[i][j]+",");
                }
                System.out.println();
            }
            //double[][] goodRes = new double[][]{{1,2,3},{4,5,6},{7,8,9}};
            //assertEquals("testReadDoubleCSV is working good !", goodRes, res);
            res.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        TestCSVReader tr = new TestCSVReader();
        tr.testReadDoubleCSV();
    }

}
