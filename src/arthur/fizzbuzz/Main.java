package arthur.fizzbuzz;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++){
            if (i%3 == 0 && i%5 == 0) {
                System.out.println(i+" FizzBuzz");
            }
            else if (i % 3 == 0) {
                if (i % 7 == 0) {
                    System.out.println(i+ " FizzBang");
                } else {
                    System.out.println(i+ " Fizz");
                }
            } else if (i% 5 == 0) {
                System.out.println(i+" Buzz");
            } else if (i % 7 == 0){
                System.out.println(i+" Bang");
            } else if (i % 11 == 0) {
                System.out.println(i+" Bong");
            } else if (i % 13 == 0) {
                if (i % 3 ==0 || i % 5 ==0 ){
                    System.out.println(i+ "");
                } else {
                    System.out.println(i+ " Fezz");
                }
            }else {
                System.out.println(i);
            }
        }


    }
}
