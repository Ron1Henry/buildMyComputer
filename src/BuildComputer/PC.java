package BuildComputer;


import javax.management.monitor.Monitor;

public class PC {

    private String owner;
    private Monitor monitor;
    private Motherboard motherboard;
    private Case theCase;

    public PC(Monitor m, Motherboard mb, Case theCase, String name) {
     this.owner = name;
     this.monitor = m;
     this.motherboard = mb;
     this.theCase = theCase;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Case getTheCase(){
        return theCase;
    }
    public void setTheCase(Case theCase){
        this.theCase = theCase;
    }

}
