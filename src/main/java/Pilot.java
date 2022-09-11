public class Pilot {

    private String name;
    private String licenseNumber;
    private PilotRank pilotRank;

    public Pilot(String name, String licenseNumber, PilotRank pilotRank){
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.pilotRank = pilotRank;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String pilotName){
        this.name = pilotName;
    }

    public String getLicenseNumber(){
        return this.licenseNumber;
    }

    public void setLicenseNumber(String license){
        this.licenseNumber = license;
    }

    public PilotRank getRank(){
        return this.pilotRank;
    }

}
