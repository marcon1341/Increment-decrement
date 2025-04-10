//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y;
        x++; // adds 1 to x (now it is 6)
        ++x; // adds 1 to x (now it is 7)
        y = ++x; // adds 1 to x and then assigns x to y
// x is now 8 and y is 8
        System.out.println(x);
        System.out.println(y);
        x = 5;
        y = x++; // assigns x to y and then adds 1 to x
// x is now 6 and y is 5
        System.out.println(x);
        System.out.println(y);

        int a = 10;
        a *= 10;
        System.out.println(a);

        int b = 0;
        b += 5;
        b += 5;
        System.out.println(b);

        int c = 10;
        c /= 2;
        System.out.println(c);

        int d = 33;
        d -= 11;
        System.out.println(d);

    }
}