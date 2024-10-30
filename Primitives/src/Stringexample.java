public class Stringexample {
    public static void main(String[] args) {
//      String message = greet();
//        System.out.println(message);
         String personalized = myGreat("Subham kumar");
        System.out.println(personalized);
    }
    static String myGreat(String name){
        String message = "hello " + name;
        return message;
    }
    static String greet() {
       String greeting ="how are you";
       return greeting;
    }
}
