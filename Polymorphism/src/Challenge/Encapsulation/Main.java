package Challenge.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50);
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.getTonerLevel());

        int pagesPrintedJob = printer.printPages(3);
        System.out.println("Total Pages printed: " + printer.getPagesPrinted());
        pagesPrintedJob = printer.printPages(9);
        System.out.println("Total Pages printed: " + printer.getPagesPrinted());
        System.out.println("Pages printed [latest job]:" + pagesPrintedJob);
    }
}
