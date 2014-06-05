/**
  Auto Generated Java Class.
 */
public class PercolationStats{
   private double[] ratio ;
   private static Percolation exp1;
   //StdStats stats= new StdStats;
   //StdRandom sites;
    public PercolationStats(int N, int T){   // perform T independent computational experiments on an N-by-N grid
           exp1 =new Percolation(N);
           ratio= new double[T];
           //stats = new StdStats;
           //sites = new StdRandom;
       }
   
   public double mean(double[] ratio){                     // sample mean of percolation threshold
       return StdStats.mean(ratio);
       
   }
   public double stddev(double[] ratio){                   // sample standard deviation of percolation threshold
      return StdStats.stddev(ratio);
   }
   //public double confidenceLo()             // returns lower bound of the 95% confidence interval
   //public double confidenceHi()             // returns upper bound of the 95% confidence interval
   public static void main(String[] args) {  // test client, described below
       int last_site=0;
       int x,y;
       int N= Integer.parseInt(args[0]);
       int T= Integer.parseInt(args[1]);
       PercolationStats experiment= new PercolationStats(N,T);
       /*for(int i=0; i<N; i++){
           x= StdRandom.uniform(N);
           y= StdRandom.uniform(N);
           System.out.println("x = "+ x+"y = "+y);
           //System.out.println(y);
           exp1.open(x,y);
           last_site+=1;
       }*/
       while(!exp1.percolates()){
           x= StdRandom.uniform(N);
           y= StdRandom.uniform(N);
           System.out.println("x = "+ x+"y = "+y);
           //System.out.println(y);
           exp1.open(x,y);
           last_site+=1;
       }
       System.out.println("last site ="+ last_site);
       //mean(ratio);
       //stddev(ratio);
       //confidenceLo();
       //confidenceHi();
    }
    
    /* ADD YOUR CODE HERE */
    
}
