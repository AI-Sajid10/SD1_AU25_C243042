public class Teacher_main {
    public static void main(String[] args){
        Teacher t1 = new Teacher();

        Teacher t2 = new Teacher("Sajid","Male");
        t2.DisplayInfo();

        Teacher t3 = new Teacher("XYZ", "Female",20);
        t3.DisplayInfo();
    }
}
