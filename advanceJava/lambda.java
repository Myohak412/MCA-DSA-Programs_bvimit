package advanceJava;
interface sayable{
    void say();
}
public class lambda {
    public static void main(String[]args){
    sayable s1 = ()-> {
        System.out.println("Hello world");
    };
    s1.say();
}}
