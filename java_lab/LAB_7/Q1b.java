abstract class Vegetable {
    String color;

    public Vegetable(String color) {
        this.color = color;
    }

   
    public String toString() {
        return getClass().getSimpleName() + " (Color: " + color + ")";
    }
}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }
}

public class Q1b {
    public static void main(String[] args) {
        Potato potato = new Potato("Brown");
        Brinjal brinjal = new Brinjal("Purple");
        Tomato tomato = new Tomato("Red");

        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}
