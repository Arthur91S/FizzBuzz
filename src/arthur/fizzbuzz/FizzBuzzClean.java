package arthur.fizzbuzz;

public class FizzBuzzClean {

    public void fizzbuzz() {

        for (int i = 1; i < 205; i++) {

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

            if (i % 11 == 0) {
                text = "Bong";
            }

            if (i % 13 == 0 ) {
                int indexOfB = text.indexOf("B");
                if (indexOfB == -1){
                    text = "Fezz" + text;
                } else {
                    text = text.substring(0, indexOfB) + "Fezz" + text.substring(indexOfB);
                }
            }

            if (text.equals("")) {
               text += Integer.toString(i);
            }

            System.out.println(text);
        }
    }
}
