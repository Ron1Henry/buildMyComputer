package BuildComputer;

public class Case {

    //width, depth, height

    private String manufacture;
    private int numberFans;
    private String casetype;
    private Dimension dimension;
    //    private double width;
//    private double depth;
//    private double height;

    public Case(String manufacture, int numberFans, String casetype, Dimension dimension) {
        this.manufacture = manufacture;
        this.numberFans = numberFans;
        this.casetype = casetype;
        this.dimension = dimension;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getNumberFans() {
        return numberFans;
    }

    public void setNumberFans(int numberFans) {
        this.numberFans = numberFans;
    }

    public String getCasetype() {
        return casetype;
    }

    public void setCasetype(String casetype) {
        this.casetype = casetype;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
