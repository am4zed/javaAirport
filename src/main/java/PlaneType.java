public enum PlaneType {
    AIRBUSA340(295),
    AIRBUSA380(853),
    BOEING747(600),
    BOEING777(400),
    PRIVATEPLANE(3);

    private final int capacity;

    PlaneType( int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
