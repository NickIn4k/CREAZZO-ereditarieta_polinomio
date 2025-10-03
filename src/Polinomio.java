import java.util.ArrayList;

public abstract class Polinomio {
    protected ArrayList<Integer> coefficienti;
    protected ArrayList<Float> soluzioni;

    public Polinomio(ArrayList<Integer> coefficienti) {
        this.coefficienti = coefficienti;
        this.soluzioni = new ArrayList<Float>();
    }

    public String printCoefficienti(){
        String res = "Coefficienti: ";
        for(int i=0;i<coefficienti.size();i++)
            res+=coefficienti.get(i)+" ";
        return res;
    }

    public String printRisultati(){
        String res = "Soluzioni: ";
        for(int i=0;i<soluzioni.size();i++)
            res+=soluzioni.get(i)+" ";
        return res;
    }

    public abstract void calcolaRis();
    public abstract void calcolaRis(Float x);
}

