package sg.edu.rp.c346.boxlist;

/**
 * Created by 16019829 on 23/7/2018.
 */

public class BoxListItem {

    private boolean firstbox;
    private boolean secondbox;
    private boolean thirdbox;

    public BoxListItem(boolean firstbox, boolean secondbox, boolean thirdbox) {
        this.firstbox = firstbox;
        this.secondbox = secondbox;
        this.thirdbox = thirdbox;
    }

    public boolean isFirstbox() {
        return firstbox;
    }

    public void setFirstbox(boolean firstbox) {
        this.firstbox = firstbox;
    }

    public boolean isSecondbox() {
        return secondbox;
    }

    public void setSecondbox(boolean secondbox) {
        this.secondbox = secondbox;
    }

    public boolean isThirdbox() {
        return thirdbox;
    }

    public void setThirdbox(boolean thirdbox) {
        this.thirdbox = thirdbox;
    }

    @Override
    public String toString() {
        return "BoxListItem{" +
                "firstbox=" + firstbox +
                ", secondbox=" + secondbox +
                ", thirdbox=" + thirdbox +
                '}';
    }
}

