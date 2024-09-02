

//5.Write a program which has static block and constructor overloading,initialise variables 
//using constructors and print it.
public class staticBlock {



    static {
        System.out.println("this is static block bhailog");
    }

    public String naam;
    public int umar;

    staticBlock(String naae) {
        this.naam = naae;
    }

    staticBlock(int umar) {
        this.umar = umar;
    }

    staticBlock(String naam, int umar) {
        this.naam = naam;
        this.umar = umar;
    }
    public String pta() {
        return "StaticBlock[name: " + naam + ",   age " + umar+"]";
    }


    public static void main(String[] args) {
        staticBlock st2 = new staticBlock("Rohan");
        System.out.println("name is " + st2.naam);
        staticBlock st1 = new staticBlock(30);
        System.out.println("AGE is " + st1.umar);
        staticBlock st3 = new staticBlock("shivam", 40);
        System.out.println(st3.pta());

    }
}
