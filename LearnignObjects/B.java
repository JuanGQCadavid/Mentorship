
/**
 * Write a description of class B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class B extends A
{
    @Override
    public int abc(int a, int b){
        return a + b;
    }
    
    B(){
        super( 20 );
    }
    
    public void testingVariables(){
        super.a = 8;
        a = 9;
        System.out.println(" -> " + super.a);
    }
    
    public static void main(String[] args){
        System.out.println(" -> ");
    }
}