package hu.progmasters.desk;

public class Radio {

    public String radioStation;
    public boolean isRadioOn;


    public Radio(String radioStation, boolean isRadioOn) {
        this.radioStation = radioStation;
        this.isRadioOn = isRadioOn;
    }

    public void setRadioStation(String radioStation) {
        this.radioStation = radioStation;
    }

    public void turnRadioOn() {
        isRadioOn = true;
    }

    public void turnRadioOff() {
        isRadioOn = false;
    }

    public String toString () {
        if (isRadioOn == true) {
            return "The radio is on, and the actual radio station is: " + radioStation + ".";
        } else {
            return "The radio is off.";
        }
    }
}
