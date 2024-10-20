public class Date {
    private int date;
    private int month;
    private int year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if(date<=31){
        this.date = date;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<=12){
        this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<=2030){
            this.year = year;
        }

    }
    public void displayDate(){
        System.out.println(date+"/"+month+"/"+year);
    }
}

