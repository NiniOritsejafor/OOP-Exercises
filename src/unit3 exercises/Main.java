package lectures;

import unit3.Exercise1;
import unit3.MainExercise1;
import unit3.MainExercise2;

public class Main {

    public static void main(String[] args) {

        Exercise1 ex = new Exercise1();
        ex.printOddUpTo(11);

        Exercise1 MyWord = new Exercise1();
        System.out.println(MyWord.getABCUpTo('j'));

        MainExercise1.main(args);
        MainExercise2.main(args);







    }
}
