public class Matrix {
    
    private double[][] matrix;

    /**
     * Create a new matrix by initiating it to the specified size h and l.
     * @param h
     * @param l
     */
    public Matrix(int h, int l){
        initMatrix(h, l);
    }

    /**
     * Create a new matrix by importing it from the static assets path.
     * @param path
     */
    public Matrix(String path){
        
    }


    /**
     * initMatrix is initiate the matrix to the size h and l, than set it all to 0.
     * @param h height of the matrix
     * @param l length of the matrix
     */
    private void initMatrix(int h, int l){
        matrix = new double[h][l];
        for(int i=0;i<h;i++){
            for(int j=0;j<l;j++){
                matrix[i][j] = 0;
            }
        }
    }

}
