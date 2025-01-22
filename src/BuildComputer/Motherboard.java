package BuildComputer;


//depth and width
public class Motherboard {

    private String brandName;
    private Dimension dMotherboard ;
    private String socketType;

    public Motherboard(String brandName, Dimension dMotherboard, String socketType) {
        this.brandName = brandName;
        this.dMotherboard = dMotherboard;
        this.socketType = socketType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Dimension getdMotherboard() {
        return dMotherboard;
    }

    public void setdMotherboard(Dimension dMotherboard) {
        this.dMotherboard = dMotherboard;
    }

    public String getSocketType() {
        return socketType;
    }

    public void setSocketType(String socketType) {
        this.socketType = socketType;
    }
}
