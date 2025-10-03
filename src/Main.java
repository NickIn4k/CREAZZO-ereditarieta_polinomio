//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Retta r = new Retta(2, 3);   // y = 2x + 3
        r.calcolaRis(5.0f);

        System.out.println(r.printCoefficienti());
        System.out.println(r.printRisultati());

        Parabola p = new Parabola(1, -3, 2); // x^2 -3x + 2 = 0
        p.calcolaRis();

        System.out.println(p.printCoefficienti());
        System.out.println(p.printRisultati());
    }
}
