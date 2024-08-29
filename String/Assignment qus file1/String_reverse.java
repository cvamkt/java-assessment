public class String_reverse {
    public static void main(String[] args) {
        String nm = "cvam";
        String rev = "";
        for(int i = nm.length() -1; i >=0; i--){
            char ulta = nm.charAt(i);
            rev = rev + ulta;
        }
        System.out.println(rev);
    }
}
