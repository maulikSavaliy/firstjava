public class calculator {

    static int a = 50;
    static int b = 40;



    public static void main(String[] arg){
     add();
     sub();
     multi();
     div();
    }
    static void add(){
        int answer =(a+b);
        System.out.println("addition of "+a+ " & "+b+ " = "+answer);

    }
    static void sub(){
        int answer = (a-b);
        System.out.println("subtraction of "+a+ " & "+b+ " = "+answer);
    }
    static void multi(){
        int answer = (a * b);
        System.out.println("multiplication of "+a+ " & " +b+ " = "+answer);
    }
    static void div(){
        double answer = (a/b);
        System.out.println(" division of " + a + " & " +b+ " = "+answer);
    }
}

