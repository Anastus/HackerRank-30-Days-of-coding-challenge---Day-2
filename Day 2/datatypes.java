import java.util.Scanner;

class solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        int j = scan.nextInt();
        double e = scan.nextDouble();
        scan.nextLine();
        String t = scan.nextLine();

        j += i;
        e += d;
        s += t;

        System.out.println(j);
        System.out.println(e);
        System.out.println(s);

        scan.close();

    }
}