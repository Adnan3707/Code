public class Bed {
    String style;
    String pillows;
    String height;
    String sheets;
    int quilt;

    public Bed(String style, String pillows, String height, String sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make(){
        System.out.println("Bed is being made");
    }

    public String getStyle() {
        return style;
    }

    public String getPillows() {
        return pillows;
    }

    public String getHeight() {
        return height;
    }

    public String getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
