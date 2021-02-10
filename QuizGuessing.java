import java.util.Scanner;

public class QuizGuessing {

    // main method
    public static void main(String[] args) {
        // variable
        int choices;
        int song;
        int song2;
        int song3;
        int song4;
        int song5;
        int score = 0;

        // scanner for input options
        Scanner scan = new Scanner(System.in);
        System.out.println("Who has sung the song 'Ink':");

        // choose singer from these 4 options
        System.out.println(
                "Choose 1 for Karan Aujla. \nChoose 2 for Sidhu Moose wala.  \nChoose 3 for Jassie Gill. \nChoose 4 for Guri.");
        song = scan.nextInt();

        if (song != 1) {
            // if select wrong options
            System.out.println("Your answer is incorrect  Karan Aujla is the right answer .");
        }

        {
            while (song == 1) {
                // selected right option
                System.out.println("Congrate you answer is correct");

                song++;
                score++;
            }
            System.out.println();
        }

        System.out.println("Who has sung the song 'Legend':");

        // choose singer from these 4 options
        System.out.println(
                "Choose 1 for Karan Aujla. \nChoose 2 for Sidhu Moose wala.  \nChoose 3 for Jassie Gill. \nChoose 4 for Guri");
        song2 = scan.nextInt();

        if (song2 != 2) {
            System.out.println("Your answer is incorrect  Sidhu Moose wala is the right answer.");
        }

        {
            while (song2 == 2) {
                System.out.println("Congrate you answer is correct ");
                song2++;
                score++;
            }
            System.out.println();
        }
        // name the singer of this song
        System.out.println("Who has sung the song 'Jail':");

        // choose singer from these 4 options
        System.out.println(
                "Choose 1 for Karan Aujla. \nChoose 2 for Mankirt Aulakh.  \nChoose 3 for Jassie Gill. \nChoose 4 for Guri");
        song4 = scan.nextInt();

        if (song4 != 2) {
            System.out.println("Your answer is incorrect  Mankirt Aulakh is the right answer.");
        }

        {
            while (song4 == 2) {
                // display congrate message for right answer
                System.out.println("Congrate you answer is correct");
                score++;
                song4++;
            }
            System.out.println();
        }

        // display Question
        System.out.println("Who has sung the song 'Who Cares':");

        // choose singer from these 4 options
        System.out.println(
                "Choose 1 for Karan Aujla. \nChoose 2 for Sidhu Moose wala.  \nChoose 3 for Jassie Gill. \nChoose 4 for Maninder Bhuttar");
        song3 = scan.nextInt();

        if (song3 != 4) {
            // display congrate message for incorrect answer
            System.out.println("Your answer is incorrect  Maninder Bhuttar is the right answer.");
        }

        {
            while (song3 == 4) {
                // display congrate message for right answer
                System.out.println("Congrate you answer is correct");
                score++;
                song3++;
            }
            System.out.println();
        }
        // name of a singer
        System.out.println("Who has sung the song 'Guitar Sikhda':");

        // choose singer from these 4 options
        System.out.println(
                "Choose 1 for Karan Aujla. \nChoose 2 for Sidhu Moose wala.  \nChoose 3 for Jassie Gill. \nChoose 4 for Guri");
        song5 = scan.nextInt();
        if (song5 != 3) {
            System.out.println("Your answer is incorrect  Jassie Gill is the right answer.");
        }
        {
            // using while loop
            while (song5 == 3) {
                // display congrats message for right answer
                System.out.println("Congrats you answer is correct");
                // stop repeating
                score++;
                song5++;
            } // stop repeating
            System.out.println();
        }
        System.out.println("Your final score = " + score + "/5");
    }
}