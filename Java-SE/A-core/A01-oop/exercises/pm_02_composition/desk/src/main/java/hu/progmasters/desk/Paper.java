package hu.progmasters.desk;

public class Paper {

    public String content;

    public Paper(String paper) {
        this.content = paper;
    }

    public String toString () {
        return "These words are in the paper: " + content + ".";
    }
}

