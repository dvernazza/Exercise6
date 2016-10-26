package murach.business;

import java.io.Serializable;

public class Year implements Serializable {

    private int currentYear;
    

    public Year() {
        currentYear = 0;
        
    }

    public Year(int currentYear) {
        this.currentYear = currentYear;
       
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    
}
