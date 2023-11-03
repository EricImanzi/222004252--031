public class trial3 {
    public static double CI(double P, double R, double N, double T){
        return (P* Math.pow(1+(R/N),N*T));
    }
    public static void main(String[] args){
        trial3 myCI = new trial3();
         double result = myCI.CI(500000,0.18,12,3);

         System.out.println("The total amount to be paid in 3 years is " + result);
    }
    
}
