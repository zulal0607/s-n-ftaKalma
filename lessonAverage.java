import java.util.Scanner;

public class lessonAverage {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;
        double counter = 0, total = 0;

        System.out.println("mat notunuz :");
        mat = inp.nextInt();
        if (!(mat <= 0 || mat >= 100)) {
            total += mat;
            counter++;
        }

        System.out.println("fizik notunuz :");
        fizik = inp.nextInt();
        if (!(fizik <= 0 || fizik >= 100)) {
            total += fizik;
            counter++;
        }


        System.out.println("kimya notunuz :");
        kimya = inp.nextInt();
        if (!(kimya <= 0 || kimya >= 100)) {
            total += kimya;
            counter++;
        }


        System.out.println("turkce notunuz :");
        turkce = inp.nextInt();
        if (!(turkce <= 0 || turkce >=  100)) {
            total += turkce;
            counter++;
        }

        System.out.println("tarih notunuz :");
        tarih = inp.nextInt();
        if (!(tarih <= 0 || tarih >= 100)) {
            total += tarih;
            counter++;
        }

        System.out.println("müzik notunuz :");
        muzik = inp.nextInt();
        if (!(muzik <= 0 || muzik >= 100)) {
            total += muzik;
            counter++;
        }

        if (total/counter > 55) {
            System.out.println("geçtiniz ");
        } else {
            System.out.println("kaldınız ");
        }


    }
}
