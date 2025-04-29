package products;

import javax.swing.plaf.ProgressBarUI;

public class Notebook extends Product {
    private static final int NOTE_BOOK = 2000;

    private int pageCount;
    private boolean isHardCover;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.isHardCover = isHardCover;
        this.pageCount = pageCount;
        setId(generateId());

    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    public String toString (){
        String temp = null;
        if(isHardCover) temp = "Hard";
        else temp = "Soft";
        return super.toString() + "\nPage Count: " + pageCount + "\nPage Cover is " + temp;
    }

    @Override
    protected String generateId() {
        String temp = String.valueOf(NOTE_BOOK + num);
        num++;
        return temp;

    }
}
