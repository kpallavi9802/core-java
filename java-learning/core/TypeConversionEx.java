public class TypeConversionEx {
    public static void main(String[] args) {
        /*
         * Type Conversion --> Implicit type conversion ( lower datatypes -> higher datatypes, type conversion will be taken care by compiler itself i.e widening term)
         *                 --> Explicit type conversion ( higher -> lower data type conversion is not possible automatically i.e narrowing term , we need to explicitly convert )
         * Type Promotion --> storing result  of lower datatypes values into hight datatype value, comipler will take of this conversion automatically
         */

         // Implicit type conversion
         byte b = 127;
         int a = b; // valid

         // Explicit Conversion
         int num = 265;
        //  byte bt = a; // invalid
        byte bt = (byte)num;  // 265 % 256 = 9( byte range -> 128 + 127)

        System.out.println(bt);

        float marks = 3.5f;
        int convertedMarks = (int)marks;


        // Type Promotion
        byte b1 = 10;
        byte b2 = 30;
        int reult = b1 * b2; // 300

    }
    
}
