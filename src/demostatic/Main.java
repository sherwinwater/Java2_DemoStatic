package demostatic;

import content.TheStatic;

public class Main {

    public static void main(String[] args) {
        TheStatic one = new TheStatic();
        TheStatic two = new TheStatic();

        //instance or non-static
        System.out.println("one's name is " + one.name);
        System.out.println("two's name is " + two.name);
        //System.out.println(TheStatic.name); // non-static method cannot be referenced from static method

        one.name = "Barney";
        System.out.println("one's name is " + one.name);
        System.out.println("two's name is " + two.name);  // not changed

        //static
        System.out.println("one's company name is " + one.company); // not good idea to do so.
        System.out.println("two's company name is " + two.company);

        one.company = "ABC";
        System.out.println("one's company name is " + one.company);
        System.out.println("two's company name is " + two.company);  // changed also

        TheStatic.company = "XYZ Inc"; // Use the class name(TheStatic) to change
        System.out.println("one's company name is " + one.company);
        System.out.println("two's company name is " + two.company);  // changed also
        System.out.println("company's name is " + TheStatic.company);
        
        //TheStatic.name = "Wilma";  // non-static method cannot be referenced from static method
        

    }

}
