public class Display {

    private double sizeInches;
    private String resolution;
    private boolean onOff;
    
    public Display(double sizeInches, String resolution) {
        this.sizeInches = sizeInches;
        this.resolution = resolution;    
        this.onOff = false;
    }

    public String turnOn(){
        return "Display turned on. " + this.sizeInches + "-inch, " + this.resolution;
    }

    public String turnOff(){ 
        return "Display turned off.";
    }

    public double getSizeInches() {
        return this.sizeInches;
    }

    public String getResolution(){
        return this.resolution;
    }

    public boolean getOnOff() {
        return this.onOff;
    }
    
    public String toString(){
        return "Display: " + this.sizeInches + " inches, " + resolution;
    }
}