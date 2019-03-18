import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 100);
    }
    @Test
    public void canPrint(){
    printer.print(2,5);
        assertEquals(40, printer.sheetsLeft());
        assertEquals(90, printer.toner());

    }
}




//import org.junit.Before;
//        import org.junit.Test;
//
//        import static org.junit.Assert.assertEquals;
//


//    Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Create a method to refill the printer paper.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.