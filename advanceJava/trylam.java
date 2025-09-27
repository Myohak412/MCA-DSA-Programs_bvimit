package advanceJava;

interface  hello{
    void say(int x);
}
public class trylam {
    public static void main(String[] args) {
        hello obj = (int x)-> System.out.println(2*x);
        obj.say(8);
    }
    
}
//output:  16