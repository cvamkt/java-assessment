public class check {
    public static void main(String[] args) {
        String word = "Umbrella";
        boolean contains = word.toLowerCase().contains("e");
        if(contains){
            System.out.println("letter is present in "+ word );
        }else{
            System.out.println("not");
        }
    }
}
