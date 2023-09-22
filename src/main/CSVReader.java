package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
    
    public static double[][] readDoubleCSV(String path) throws IOException{
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

        double[][] res = new double[data.size()][data.get(0).size()];

        for(int i=0;i<data.size();i++){
            for(int j=0;j<data.get(i).size();j++){
                res[i][j] = data.get(i).get(j);
            }
        }

        br.close();
        return res;
    }

}
