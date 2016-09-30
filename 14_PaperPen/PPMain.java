import java.util.Scanner;

public class PPMain {

    public static void main(String[] args) throws Throwable {
        Paper paper = new Paper(30);
        Pen pen = new Pen(paper, 20);
        Scanner in = new Scanner(System.in);

        System.out.println("Current capacity ink in Pen: ");
        System.out.println(pen.getCurrentCapacity());

        pen.refill(20);

        System.out.println("Input a text: ");
        pen.write(paper, in.nextLine());

        paper.show();
        System.out.println(pen);
    }
}