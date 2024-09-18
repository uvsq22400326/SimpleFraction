public class Fraction{

    private int numerateur;
    private int denominateur;
    private static final Fraction ZERO= new Fraction(0,1);
    private static final Fraction UN= new Fraction(1,1);


    public Fraction(int numerateur,int denominateur){
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        this.numerateur=numerateur;
        this.denominateur=denominateur;

    }

    public Fraction(int numerateur){
        this.numerateur=numerateur;
        this.denominateur= 1;

    }

    public Fraction(){
        this.numerateur=0;
        this.denominateur=1;
    }
    public String toString(){
        return numerateur + "/" + denominateur;
    }

    public int  getNUMERATEUR(){
        return this.numerateur;
    }
    public int getDENOMINATEUR(){
        return this.denominateur;
    }
    public Fraction getZERO(){
        return ZERO;
    }
    public Fraction getUN(){
        return UN;
    }



}



