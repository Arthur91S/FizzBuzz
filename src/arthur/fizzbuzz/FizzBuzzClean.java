package arthur.fizzbuzz;

public class FizzBuzzClean {

    public void fizzbuzz() {

        for (int i = 1; i < 100; i++) {

            String text = "";

            if (i % 3 == 0) {
                text = "Fizz";
            }

            if (i % 5 == 0) {
               text += "Buzz";
            }

            if (i % 7 == 0) {
                text += "Bang";
            }

            if (i % 11 == 0){
                text = "Bong";
            }

            if (i % 13 == 0){
                text = "Fezz";
            }

            if (!text.equals("")){
                System.out.println(text);
            } else {
                System.out.println(i);
            }
        }
    }


}
