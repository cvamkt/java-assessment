// 2.Write a program and create a constructor with parameters and initialise the variable using 
//a constructor.

public class constructor3 {

    private String name;
    private int age;

    constructor3(String name, int age)

    {
        this.name = name;
        this.age = age;
    }
    public void dekho(){
        System.out.println(name + " "+ age);
    }

    public static void main(String[] args) {
        constructor3 cons = new constructor3("shivam", 30);
        cons.dekho();
    }
}
