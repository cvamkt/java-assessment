// 3.Use a private keyword for a variable and use setter and getter methods to initialise and 
//print the values. 

class chhatr {

    private String sal;
    private int size;

    public void setSal(String sallr) {
        this.sal = sallr;
    }

    public void setSize(int chauda) {
        this.size = chauda;
    }
    public String getSal(){
        return sal;
    }
    public int getSize(){
        return size;
    }
}

public class setGet {

    public static void main(String[] args) {
        chhatr ch = new chhatr();
        ch.setSal("twentyK");
        ch.setSize(20);
        String dikhao = ch.getSal();
        int dhhola = ch.getSize();
        System.out.println("biceps size is "+dhhola);
        System.out.println("sallery is "+ dikhao);
    }
}
