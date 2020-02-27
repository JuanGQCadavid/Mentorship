
/**
 * Write a description of class IC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface  IC
{
     void xyz();     
     
     public void asd();
     
     private static void pwe(){}
     
     private void qwe(){
         System.out.println("Eh!?");
     }
     
     default void jkl(){
         qwe();
         System.out.println("Ay Marica...");
     }
     
 }