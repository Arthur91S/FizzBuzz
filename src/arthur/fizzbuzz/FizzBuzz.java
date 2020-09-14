package arthur.fizzbuzz;

public class FizzBuzz {

    public void fizzbuzz() {

        String fezz = "";
        Boolean reverse;

        for (int i = 1; i < 260; i++) {

            fezz = (i % 13 == 0 ? "Fezz" : "");
            reverse = i % 17 == 0;

            if (i % 3 == 0 && i % 5 == 0) {
                if (reverse) {
                    System.out.println(i + " Buzz" + fezz + "Fizz");
                } else {
                    System.out.println(i + " Fizz" + fezz + "Buzz");
                }
            } else if (i % 3 == 0) {
                if (i % 7 == 0) {
                    if (reverse) {
                        System.out.println(i + " Bang" + fezz + "Fizz");
                    } else {
                        System.out.println(i + " Fizz" + fezz + "Bang");
                    }
                } else {
                    System.out.println(i + " Fizz");
                }
            } else if (i % 5 == 0) {
                if (reverse) {
                    System.out.println(i + " Buzz" + fezz);
                } else {
                    System.out.println(i + " " + fezz + "Buzz");
                }
            } else if (i % 7 == 0) {
                System.out.println(i + " Bang");
            } else if (i % 11 == 0) {
                if (reverse) {
                    System.out.println(i + " Bong" + fezz);
                } else {
                    System.out.println(i + " " + fezz + "Bong");
                }
            } else if (i % 13 == 0) {
                System.out.println(i + " Fezz");
            } else {
                System.out.println(i);
            }
        }


    }
}
