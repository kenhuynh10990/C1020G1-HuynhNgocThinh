package OOP.bai_tap;

public class Fan {
    private int speed = 1;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }
    public Fan(int speed, double radius, String color, boolean status){
        this.speed= speed;
        this.radius=radius;
        this.color=color;
        this.status =status;
    }
    public double getRadius() {
        return this.radius;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getStatus(){
        return this.status;
    }
    public String getColor(){
        return this.color;
    }
    public double setRadius(double radius) {
        return this.radius=radius;
    }
    public int setSpeed(int speed){
        return this.speed = speed;
    }
    public boolean setStatus(boolean status){
        return this.status = status;
    }
    public String setColor(String color){
        return this.color = color;
    }
    public String toString(){
        if(this.status){
            System.out.println("Fan is on");
        }else {
            System.out.println("Fan is off");
        }
        return "speed: "+this.speed+"radius: "+this.radius+"color: " +this.color;
    }

    public static void main(String[] args) {
        Fan fan1 =new Fan(3,10,"yellow",true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(2,5,"blue",false);
        System.out.println(fan2.toString());
    }
}
