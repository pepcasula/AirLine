public enum PlaneType {
    ERJ135(40, 3200),
    CRJ100(50, 3500),
    SJ100(80, 4800);

    private int capacity;
    private int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }


    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }

}
