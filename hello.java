// lambda exp- a block of code that takes parameters and returns a value
/*  syntax- 
  (parameter1 , parameter2)-> { code block}
    return result;

    lambda needs functional interface with only one abstract method
*/

interface sayable{
    void say(); //abstract method
}
public class hello {
    public static void main(String[] args){
sayable s = () -> {
    System.out.println("Hello world");
};
s.say();
}  
}
