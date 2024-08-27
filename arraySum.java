class sum{
    public int add(int num[]){
        int jodo =0;
        for (int n : num) {
            jodo= jodo+n;
        }
        return jodo;
    }
}




public class arraySum {
public static void main(String[] args) {
    sum obj = new sum();
    int result = obj.add(new int[]{1,2,3,4,5});
    System.out.println("RESULT "+ result);
}
  
}

