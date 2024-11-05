
package kma.baitapdate;


public class MyDate {
    private int date, month, year;

    public MyDate(MyDate md) {
        this.date = md.date;
        this.month = md.month;
        this.year = md.year;
    }
    public MyDate(){

    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

     public void kcj(){
        
     }
    
}