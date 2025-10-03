import java.util.ArrayList;

public class Retta extends Polinomio {
    private Integer m;
    private Integer q;

    public Retta(Integer m, Integer q) {
        super(new ArrayList<Integer>());
        this.m = m;
        this.q = q;
        coefficienti.add(m);
        coefficienti.add(q);
    }

    @Override
    public void calcolaRis() {
        float y = m * 0 + q;
        soluzioni.add(y);
    }

    @Override
    public void calcolaRis(Float x){
        float y = m * x + q;
        soluzioni.add(y);
    }
}

