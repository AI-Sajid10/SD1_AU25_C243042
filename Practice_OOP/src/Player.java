public class Player {
    String name, club;
    int age, goal;
    void setInfo(String name, String club, int age, int goal) {
        this.name = name;
        this.club = club;
        this.age = age;
        this.goal = goal;
    }
    void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Club: " + club);
        System.out.println("Age: " + age);
        System.out.println("Goal: " + goal);
        System.out.println();
    }
}
