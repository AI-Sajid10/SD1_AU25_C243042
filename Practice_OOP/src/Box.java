public class Box {
    double weight, height, depth;
    Box(double weight, double height, double depth) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    void DisplayInfo() {
        double vol = weight * height * depth;
        System.out.println("Volume is: " + vol);
    }

    public static void main(String[] args) {
        Box b1 = new Box(10,10,10);
        b1.DisplayInfo();

        Box b2 = new Box(20,30,10);
        b2.DisplayInfo();
    }
}
