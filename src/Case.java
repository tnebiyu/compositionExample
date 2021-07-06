public class Case {
    private String model;
    private String manufacture;
    private String powerSuupply;
    private Dimensions dimensions;

    public Case(String model, String manufacture, String powerSuupply, Dimensions dimensions) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSuupply = powerSuupply;
        this.dimensions = dimensions;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSuupply() {
        return powerSuupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
