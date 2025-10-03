import java.util.ArrayList;

public class Parabola extends Polinomio {
    private Integer a;
    private Integer b;
    private Integer c;

    public Parabola(Integer a, Integer b, Integer c) {
        super(new ArrayList<Integer>());
        this.a = a;
        this.b = b;
        this.c = c;
        coefficienti.add(a);
        coefficienti.add(b);
        coefficienti.add(c);
    }

    @Override
    public void calcolaRis() {
        float delta = b*b - 4*a*c;
        if(delta < 0)
            throw new ArithmeticException();

        float ris1 = (float)((-b + Math.sqrt(delta)) / (2*a));
        float ris2 = (float)((-b - Math.sqrt(delta)) / (2*a));

        soluzioni.add(ris1);
        soluzioni.add(ris2);
    }

    @Override
    public void calcolaRis(Float x) {
        soluzioni.add(a*x*x + b*x + c);
    }
}

