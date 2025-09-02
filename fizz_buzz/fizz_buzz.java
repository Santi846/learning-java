package fizz_buzz;

public class fizz_buzz {
    public static void main(String... args) {
        for (int i = 1; i < 101; i++) {
            System.out.println("i: " + i + "\n");
            int result3 = i % 3;
            int result5 = i % 5;
            if (result3 == 0) {
                System.out.println("fizz");
            }
            if(result5 == 0){
                System.out.println("buzz");
            }
            if(result3 == 0 && result5 == 0){
                System.out.println("fizzbuzz");
            }
        }
    }
}
