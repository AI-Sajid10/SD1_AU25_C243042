public class Add {
    void addition(int ... num){
        int sum = 0;
        for(int x : num){
            sum += x;
        }
        System.out.println(sum);
    }
}

