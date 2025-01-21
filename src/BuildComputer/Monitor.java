package BuildComputer;

public class Monitor {

    //Brand name - String
    //Model number - String
    //Resolution - width x height
    //Screen size - double
    private String modelNumber;
    private String brandName;
    private Resolution resolution;
    private double screenSize;

    public Monitor(String name, String model, Resolution resolution, double screenSize) {
        this.modelNumber = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.brandName = name;

    }

        public String getModelNumber () {
            return modelNumber;
        }

        public void setModelNumber (String modelNumber){
            this.modelNumber = modelNumber;
        }

        public String getBrandName () {
            return brandName;
        }

        public void setBrandName (String brandName){
            this.brandName = brandName;
        }

        public Resolution getResolution () {
            return resolution;
        }

        public void setResolution (Resolution resolution){
            this.resolution = resolution;
        }

        public double getScreenSize () {
            return screenSize;
        }

        public void setScreenSize ( double screenSize){
            this.screenSize = screenSize;
        }


    }
