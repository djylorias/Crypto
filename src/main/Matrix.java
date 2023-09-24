package main;

import java.io.IOException;

public class Matrix {
    
    private double[][] matrix;
    private int height;
    private int length;

    /**
     * Create a new matrix by initiating it to the specified size h and l.
     * @param h
     * @param l
     */
    public Matrix(int h, int l){
        initBasicMatrix(h, l);
        this.height = h;
        this.length = l;
    }

    /**
     * Create an Identity matrix based on a basic matrix size.
     * @param matrix
     */
    public Matrix(Matrix matrix){
        this.height = matrix.getHeight();
        this.length = matrix.getLength();
        initIdentityMatrix(this.height, this.length);
    }

    /**
     * Create a new matrix by importing it from the static assets path.
     * @param path
     * @throws IOException
     */
    public Matrix(String path) throws IOException{
        matrix = CSVReader.readDoubleCSV(path);
    }

    /**
     * initBasicMatrix initiate the matrix to the size h and l, than set it all to 0.
     * @param h height of the matrix
     * @param l length of the matrix
     */
    public void initBasicMatrix(int h, int l){
        this.matrix = new double[h][l];
        for(int i=0;i<h;i++){
            for(int j=0;j<l;j++){
                matrix[i][j] = 0;
            }
        }
    }

    /**
     * initIdentityMatrix initiate a matrix to the size h and l, than set 1 in diagonal from the first number.
     * @param h
     * @param l
     */
    public void initIdentityMatrix(int h, int l){
        initBasicMatrix(h, l);
        int min = Integer.min(h, l);
        for(int i=0;i<min;i++){
            this.matrix[i][i] = 1;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

}
