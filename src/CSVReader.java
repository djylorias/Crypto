import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
    
    public double[][] readDoubleCSV(String path) throws IOException{
        double[][] res = new double[0][0];
        BufferedReader br = new BufferedReader(new FileReader(path));

        ArrayList<ArrayList<Double>> data = new ArrayList<>();

        while(br.ready()){
            Scanner scanner = new Scanner(br.readLine()).useDelimiter(",");
            ArrayList<Double> line = new ArrayList<>();

            while(scanner.hasNext()){
                line.add(scanner.nextDouble());
            }

            data.add(line);

        }

        for(int i=0;i<data.size()){
            for(int j=0;j<data.get(i).size()){
                
            }
        }

        br.close();
        return res;
    }

}
