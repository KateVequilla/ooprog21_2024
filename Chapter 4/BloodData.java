public class BloodData {
    private String bloodType;
    private boolean rhFactor;

    public BloodData() {
        defaultPatient();
    }

    private void defaultPatient() {
        bloodType = "A";
        rhFactor = false; // "-"
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(boolean rhFactor) {
        this.rhFactor = rhFactor;
    }

    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + (rhFactor ? "+" : "-"));
    }
}
