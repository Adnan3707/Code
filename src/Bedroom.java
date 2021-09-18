public class Bedroom {
    private String wall1;
    private Wall1 wall2;
    private Wall1 wall3;
    private Wall1 wall4;
    private Wall1 wall5;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String wall1, Wall1 wall2, Wall1 wall3, Wall1 wall4, Wall1 wall5, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.wall5 = wall5;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public String getWall1() {
        return wall1;
    }

    public Wall1 getWall2() {
        return wall2;
    }

    public Wall1 getWall3() {
        return wall3;
    }

    public Wall1 getWall4() {
        return wall4;
    }

    public Wall1 getWall5() {
        return wall5;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void  makeBed(){
        System.out.println("Bed is being made");
    }
}
