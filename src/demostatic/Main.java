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

/*
Static homework

1.	Create a project called DemoStatic
2.	Add a folder called content that contains a class called TheStatic
3.	TheStatic contains a public String called name set to Fred.
4.	In main method, create two TheStatic objecs, one and two
a.	Print out one’s name and two’s name.
b.	Change one’s name to Barney
c.	Print out one’s and two’s name.
5.	To TheStatic, add a public static String called company that is set to “ACME Inc”
6.	In main method
a.	Print out one’s and two’s company
b.	Change one’s company to “ABC Inc”
c.	Print out one’s and two’s company.
d.	Use the class name(TheStatic) to change
i.	The company to “XYZ Inc”
e.	Print out one’s and two’s company
f.	Use the class name(TheStatic) to change the name to Wilma.
i.	What happens?		

*/