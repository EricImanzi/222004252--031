public class SWITCH {
    public static void main(String[] args){
         
        String Discipline_Conduct = "EXCELLENT"; 

        switch(Discipline_Conduct)
        {
            case "POOR":
            System.out.println("Please improve your morals");
            break;

            case "GOOD":
            System.out.println("Keep it up and improve");
            break;

            case "VERY GOOD":
            System.out.println("Keep excelling, you can make it");
            break;

            case "EXCELLENT":
            System.out.println("You deserve a reward");
            break;

            default:
            System.out.println(Discipline_Conduct);
        


        }
    
    }
    
}
