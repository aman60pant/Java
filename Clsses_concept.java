class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something!");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class Clsses_concept {
    public static void main(String[] args) {
        Pen obj = new Pen();
        obj.color = "blue";
        obj.type = "gel";
        obj.printColor();

        Pen obj1 = new Pen();
        obj1.color = "red";
        obj1.type = "ball";
        obj1.printColor();

        Pen obj2 = new Pen();
        obj2.color = "black";
        obj2.type = "dot";
        obj2.printColor();

        obj2.write();
    }
}
