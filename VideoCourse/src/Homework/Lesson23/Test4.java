 
package Homework.Lesson23;

 
class X{}
class Y extends X{}

public class Test4 {
    public static void abc(X x, Y y) {
        System.out.println("privet");
    }
    public static void abc(Y y, X x) {
        System.out.println("poka");
    }
    public static void main(String[] args) {
        Y a = new Y();
       //  abc(a,a);
    }
    
}


//ANSWER:           poka
//CORRECT ANSWER:   RuntimeEX - Uncompilable code 
//                      - reference to abc is AMBIGUOUS.
//SCORE:            0/5