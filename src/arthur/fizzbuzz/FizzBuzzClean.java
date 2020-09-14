package arthur.fizzbuzz;

public class FizzBuzzClean {

    public void fizzbuzz() {

        String fezz = "";

        for (int i = 1; i < 200; i++) {

            fezz = (i % 13 == 0 ? "Fezz" : "");

            String text = null;

            if (i % 3 == 0) {
                text = "Fizz";
            }

            if (i % 5 == 0) {
               text = fezz +"Buzz";
            }

            if (i % 7 == 0) {
                text = fezz+ "Bang";
            }

            if (i % 13 == 0){
                text = "Fezz";
            }

            if (i % 11 == 0){
                text = fezz+ "Bong";
            }

            if ( i % 3 == 0 && i % 7 == 0 ){
                text = "Fizz"+ fezz +"Bang";
            }

            if ( i % 15 == 0) {
                text = "Fizz" + fezz +"Buzz";
            }

            if (text != null){
                System.out.println(i + " " +text);
            } else {
                System.out.println(i);
            }

        }


    }
}
