
public class Reverse {

    public static void main(String[] args) {
        // StringBuilder kam = new StringBuilder("PWSKILLS");
        // kam.reverse();
        // System.out.println(kam);

        String kam = "PWSKILLS shiva";
        String rev = new StringBuilder(kam).reverse().toString();
        System.out.println(rev);
// QUESTION 3
        String str1 = "think twice";
        // String str2 = "";
        String str3[] = str1.split(" ");
        String revers[] = new String[str3.length];
        for (int i = 0; i < str3.length; i++) {
            revers[i] = new StringBuilder(str3[i]).reverse().toString();
        }
        String nam = String.join(" ", revers);
        System.out.println(nam );
    }
}
