public class Person_main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Ahmed Ibrahim Sajid");
        p1.setAge(20);
        System.out.println(p1.getAge());
        System.out.println(p1.getName());

        Person p2 = new Person();
        p2.setName("Leo Messi");
        p2.setAge(30);
        System.out.println(p2.getAge());
        System.out.println(p2.getName());
    }
}
