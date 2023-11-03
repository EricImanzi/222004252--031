import java.util.Scanner;
public class nestedloops {
    public static void main(String[] args){

        Scanner Imanzi = new Scanner(System.in);
        int rows;
        int columns;
        String symbol  = "";

        System.out.println("Enter # of rows: ");
        rows = Imanzi.nextInt();
        System.out.println("Enter # of columns: ");
        columns = Imanzi.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = Imanzi.next();

         // outer loop starts 
         for(int i=1; i<=rows; i++){
            System.out.println(symbol);
         
         // inner loop follows
            for(int j=1; j<=columns; j++);{
                System.out.print(symbol);
            }}
          



    }
    
}
