package Challenge.Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>100 || tonerLevel <0) ? -1:tonerLevel;
        this.pagesPrinted=0;
        this.duplex = duplex;
    }

    public Printer(int tonerLevel) {
        this(tonerLevel,true);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner(int tonerAmount) {
        if (((this.tonerLevel+tonerAmount) > 100) || ((this.tonerLevel+tonerAmount)<0)) {
            return - 1;
        } else {
            this.tonerLevel += tonerAmount;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {
         int jobPages = duplex ? (pages/2)+(pages%2):pages;
        this.pagesPrinted += jobPages;
        return jobPages;
    }
}
