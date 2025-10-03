public class UniStudent {
    String name;
    int id;
    static String Uniname = "International Islamic University Chittagong(IIUC)";

    UniStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void DisplayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University Name: " + Uniname);
        System.out.println();
    }
}
