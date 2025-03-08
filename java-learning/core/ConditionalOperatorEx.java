
public class ConditionalOperatorEx {
    public static void main(String[] args) {

        /*
         * if, if-else, if-else-if
         */
        int x = 4;
        int y = 6;
        int z = 10;


        if( x > y ) 
            System.out.println("x is greater");
        

        if( x < y ){
            System.out.println("x is lesser");
            System.out.println("inside if");
        }

        if( x < y ){
            System.out.println("x is lesser");
        } else {
            System.out.println("x is greater");
        }

        if( x>y && x>z)
            System.out.println("x is greater");
        else if(y>z)
            System.out.println("y is greater");
        else
            System.out.println("z is greater");
    }
    
}
