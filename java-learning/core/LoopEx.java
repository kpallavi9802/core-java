

public class LoopEx {
    public static void main(String[] args) {
        /*
         * loop --> while, do while, for
         */

        // for loop
        for(int i = 0;i< 4; i++){
            System.out.println("Hi");
        }


        // while loop
        int j = 0;
        while(j < 4){
            System.out.println("Hi");
            j++;
        }

        // do while loop
        do{
            System.out.println("Hi");
            j++;
        } while(j<8);


        // nested loop
        int x = 1;
        while(x<4){
            System.out.println("Hi");
            int y = 1;
            while(y<=3){
                System.out.println("Hello");
                y++;
            }
            x++;
        }
    }
}
