public class Palindrom_string {
    public static void main(String[] args) {
        String nam = "shivam";
        String ulta = "";
        for(int i = nam.length()-1; i>=0; i--){
            char hw = nam.charAt(i);
            ulta = ulta+hw;
        }
        if(nam.equals(ulta)){
            System.out.println("yes! " + nam + " and "+ ulta + " are palindrome");
        } else{
            System.out.println("NO");
        }
    }
}
