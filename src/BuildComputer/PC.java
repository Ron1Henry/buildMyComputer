package BuildComputer;


/**
 * this is the main structure to build a PC as a template
 */
public class PC {

    private String owner;
    private Monitor monitor; // monitor has a reference value pointing to the null
    private Motherboard motherboard;
    private Case theCase; //

    public PC(String name, Monitor m, Motherboard mb, Case theCase){
        this.owner = name;
        this.monitor = m;
        this.motherboard = mb;
        this.theCase = theCase;
    }


    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public Monitor getMonitor(){
        return monitor;
    }

    public void setMonitor(Monitor mn){
        this.monitor = mn;

    }

    public Motherboard getMotherboard(){
        return motherboard;
    }

    public void setMotherboard(Motherboard mb){
        this.motherboard = mb;
    }

    public Case getTheCase(){
        return theCase;
    }

    public void setTheCase(Case theCase){
        this.theCase = theCase;
    }

    public String toString(){
        return owner + "'s Computer specification:  \n" + monitor + "\n" + motherboard + "\n" + theCase + "\n";
    }

}
