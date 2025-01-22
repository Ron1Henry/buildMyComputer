package BuildComputer;

public class Monitor {

    //Brand name - String
    //Model number - String
    //Resolution  -  width x height  - will create Resolution class
    //Screen size  - double

    private String brandName;
    private String modelNumber;
    private Resolution resolution;
    //    private double width;
//    private double height;
    private double screenSize;

    public Monitor(String brandName, String model, Resolution resolution, double screenSize){
        this.brandName = brandName;
        this.modelNumber = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }


}
