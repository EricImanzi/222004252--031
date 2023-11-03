public class trial4 {
    public static double SIMPLEINTEREST(double P, double R, double T){
        return (P * R * T);
      }

    public static void main(String[] args){
        trial4 mySI = new trial4();
        double result = mySI.SIMPLEINTEREST(100000, 0.05, 5);

        System.out.println(" The Simple interest is " + result);
    }
    
}
