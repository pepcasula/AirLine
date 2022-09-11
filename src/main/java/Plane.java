public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planetype){
        this.planeType = planetype;
    }

    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public int getPlaneCapacity(){
        return this.planeType.getCapacity();
    }

    public int getBagWeightPerPerson(){
        return this.planeType.getTotalWeight() / 2 / this.planeType.getCapacity();
    }

}
