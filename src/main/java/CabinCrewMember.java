public class CabinCrewMember {

    private String name;
    private CabinCrewMemberRank cabinCrewMemberRank;

    public CabinCrewMember(String name, CabinCrewMemberRank cabinCrewMemberRank){
        this.name = name;
        this.cabinCrewMemberRank = cabinCrewMemberRank;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String memberName){
        this.name = memberName;
    }

    public CabinCrewMemberRank getRank(){
        return this.cabinCrewMemberRank;
    }

    public String relayTakeOffMessage(){
        return "Please fasten your seat belt and prepare for take-off";
    }

    public String relayLandingMessage(){
        return "Please fasten your seat belt and prepare for landing";
    }
}
