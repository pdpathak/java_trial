/**
 * Auto Generated Java Class.
 */
//package algs4;

//import edu.princeton.cs;
   
public class Percolation {
    private QuickFindUF qf;
    public int[] matrix;
    int size;
    public Percolation(int N) { // create N-by-N grid, with all sites blocked
    /* YOUR CONSTRUCTOR CODE HERE*/
        qf= new QuickFindUF(N*N);
    size=N;
    matrix = new int[N*N];
    for(int i=0;i<N*N;i++){
                    matrix[i]=0;
    }
    /*for(int j=0;j<N*N;j++){
        System.out.println("matrix["+j+"]= "+matrix[j]);
    }*/
    }
    
    public void open(int i, int j){
        int a = size*i;
        a= a+j;
        /*for(int k=0;k<size*size;k++){
        System.out.println("matrix["+k+"]= "+matrix[k]);
        }
        System.out.println(matrix[a]);*/
        if(matrix[a]!=1)
        {
            matrix[a]=1;
        }
        if(a%size!=0){
            if (matrix[a-1]==1){
            qf.union(a,a-1);
        }
        }
        if((a+1)%size!=0){
            if (matrix[a+1]==1){
            qf.union(a,a+1);
        }
        }
        if(a-size>0){
            if (matrix[a-size]==1){
            qf.union(a,a-size);
            }
        }
        if(a+size<size*size){
            if (matrix[a+size]==1){
                qf.union(a,a+size);
            }
        }
    // open site (row i, column j) if it is not already
        }
    
    public boolean isOpen(int i, int j){
        if(matrix[size*i+j]==1)
        {
            return true;
        }
        return false;
    }// is site (row i, column j) open?
   
    public boolean isFull(int i, int j){    // is site (row i, column j) full?
        for(int k=0;k<size;k++){
            if (matrix[k]==1){
                if(qf.connected(k,size*i+j))
                    return true;
            }
        }
        return false;
     }

    public boolean percolates(){            // does the system percolate?
        int percolates=0;
        for(int i=size*size-size; i<size*size; i++){
            //System.out.println("i is "+i);
            int x= i/size;
            int y= i%size;
            //System.out.println("x = "+ x+"y = "+y);
            if(isFull(x,y))
            {
                return true;
            }
        }
        return false;
    }
    
   /*public static void main(String []args){
       int a=4;
       Percolation test= new Percolation(a);
       test.open(1,2);
       for(int i=0;i<a*a;i++)
       {
           System.out.println("matrix["+i+"]= "+ test.matrix[i]);
       }
       test.open(0,2);
       test.open(2,2);
       for(int i=0;i<a*a;i++)
       {
           System.out.println("matrix["+i+"]= "+test.matrix[i]);
       }
       boolean ans= test.percolates();
       System.out.println(ans);
       test.open(3,2);
       
       for(int i=0;i<a*a;i++)
       {
           System.out.println("matrix["+i+"]= "+test.matrix[i]);
       }
       ans= test.percolates();
       System.out.println(ans);
       
   }*/
   /* ADD YOUR CODE HERE */
}

