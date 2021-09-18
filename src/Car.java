import java.util.Locale;

public class Car {
    private int doors;
    private int wheels;
    public String model;
    public String model1;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase(Locale.ROOT);
        if (validModel.equals("porsche") || validModel.equals("holden")){
           this.model = model;
        } else {
            this.model = "unknown";
        }
//        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
}
