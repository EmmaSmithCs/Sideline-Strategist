public class Stadium {
    // Stadium class attributes
    private String name;
    private int capacity;
    private boolean roof;
    private boolean lights;
    private int parking;

    // Stadium class constructor
    public Stadium(String name, int capacity, boolean roof, boolean lights, int parking) {
        this.name = name;
        this.capacity = capacity;
        this.roof = roof;
        this.lights = lights;
        this.parking = parking;
    }

    // Stadium class methods
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isRoof() {
        return roof;
    }

    public boolean isLights() {
        return lights;
    }

    public int getParking() {
        return parking;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public void setParking(int parking) {
        this.parking = parking;
    }

    
}
