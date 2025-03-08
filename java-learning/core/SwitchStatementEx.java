public class SwitchStatementEx {
    public static void main(String[] args) {
        int day = 3;
        switch(day){
            case 1: 
                System.out.println("Monday");
                break; // if condition matches here, it will come out of switch block
            case 2: 
                System.out.println("Tuesday");
                break; // if condition matches here, it will come out of switch block
            case 3: 
                System.out.println("Wednesday");
                break; // if condition matches here, it will come out of switch block
            case 4: 
                System.out.println("Thursday");
                break; // if condition matches here, it will come out of switch block
            case 5: 
                System.out.println("Friday");
                break; // if condition matches here, it will come out of switch block
            case 6: 
                System.out.println("Saturday");
                break; // if condition matches here, it will come out of switch block
            case 7: 
                System.out.println("Sunday");
                break; // if condition matches here, it will come out of switch block
            default:
                System.out.println("Enter a valid number");
        }
    }
    
}
