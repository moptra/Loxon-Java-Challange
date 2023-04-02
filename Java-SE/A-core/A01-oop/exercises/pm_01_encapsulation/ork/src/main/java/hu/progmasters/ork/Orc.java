package hu.progmasters.ork;

public class Orc {

    //We encapsulate all of the properties/fields of our Orc class
    // But reveal them through our getters and setters
    private String name;
    private int numberOfKills;
    private String hordeName;

    //We added a constructor, and added a parameter 'name' to it
    // With this we restricted the user/developer to be able to
    // instantiate our Orc without telling its name!
    // Note, that we also didn't include a setter for our name parameter,
    // therefore we won't be able to change its value later on, after creation
    public Orc(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfKills() {
        return numberOfKills;
    }

    //We added some logic to our setter, with the use of this,
    // we are not able to set any number smaller than zero to our field
    public void setNumberOfKills(int numberOfKills) {
        if (numberOfKills < 0) {
            this.numberOfKills = 0;
        } else {
            this.numberOfKills = numberOfKills;
        }
    }

    public String getHordeName() {
        return hordeName;
    }

    public void setHordeName(String hordeName) {
        this.hordeName = hordeName;
    }
}
