package BuildComputer;

public class Case {


    private int numberFans;
    private String manufacturer;
    private String caseType;
    private Dimension dimension;

    public Case(String m, int nf, String ct, Dimension d) {
        this.numberFans = nf;
        this.manufacturer = ct;
        this.dimension = d;
        this.caseType = m;
        this.numberFans = 0;

    }

    public int getNumberFans() {
        return numberFans;
    }

    public void setNumberFans(int numberFans) {
        this.numberFans = numberFans;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
}
