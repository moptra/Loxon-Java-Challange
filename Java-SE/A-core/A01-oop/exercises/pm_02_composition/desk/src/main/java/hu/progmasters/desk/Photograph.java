package hu.progmasters.desk;

public class Photograph {

    private String title;
    private String date;

    public Photograph(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString () {
        return "The photograph was taken in " + date + " and has the title: " + title + ".";
    }
}
