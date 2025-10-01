public class Cricketer {
    String name;
    int age;
    int run;
    Cricketer(String name, int age, int run) {
        this.name = name;
        this.age = age;
        this.run = run;
    }
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Run: " + run);
        System.out.println();
    }
}
