//演習2_8の途中。
public class Main {
    public static void main(String[] args){
        System.out.println("main method runs");
        Chatbot bot1 = new Chatbot();
        Chatbot bot2 = new Chatbot("naltoma");
        bot1.greeting();
        bot2.greeting();
        bot2.setName("ほげ");
        bot2.greeting();
        bot2.setName("差別用語");
        bot2.greeting();
    }
    
}
