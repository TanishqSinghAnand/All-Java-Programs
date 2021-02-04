public class IfStatement
{
    void Try (double quo , double dividend){
        double remeinder = dividend % quo;
        if(remeinder  == 0){
            System.out.println(""+dividend + " is fully divided by "+  quo);
        }
        else{
            System.out.println("" + dividend + " is not fully divided by " + quo);
        }
    }
}
