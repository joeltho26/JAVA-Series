package Challenge.EncapsulationTwo;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>100 || tonerLevel<0)? -1: tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        this.tonerLevel += (((tonerAmount+tonerLevel)>100) || ((tonerAmount+tonerLevel)<0))? -1:tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int printPagesJob = duplex? (pages/2) + (pages%2): pages;
        this.pagesPrinted += printPagesJob;
        return printPagesJob;
    }
}
