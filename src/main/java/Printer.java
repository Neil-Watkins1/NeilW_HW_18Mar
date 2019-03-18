public class Printer {
    int sheetsLeft;
    int toner;

public Printer(int sheetsLeft, int toner){
    this.sheetsLeft = sheetsLeft;
    this.toner = toner;
}


    public void print(int pages, int copies) {
    if (pages * copies <= sheetsLeft);
    {sheetsLeft -= pages * copies;}
        {toner -= pages * copies;}


    }

    public int sheetsLeft() {
    return sheetsLeft;
    }
    public int toner() {
    return toner;
    }
}


//    Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Create a method to refill the printer paper.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.


