public class Fraction extends Number{

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

    public double doubleValue(){
        return numerateur/ denominateur;
    }

    public Fraction add(Fraction f){
        int num = this.numerateur;
        int den = this.denominateur;
        int num2 = f.numerateur;
        int den2 = f.denominateur;

        int newNum= (num*den2) +(num2*den);
        int newDen= den * den2;

        return new Fraction(newNum,newDen);

    }

    // Implémentation des méthodes abstraites de Number
    @Override
    public byte byteValue() {
        return (byte) intValue();
    }

    @Override
    public short shortValue() {
        return (short) intValue();
    }

    @Override
    public int intValue() {
        return numerateur / denominateur;
    }

    @Override
    public long longValue() {
        return (long) intValue();
    }

    @Override
    public float floatValue() {
        return (float) numerateur / denominateur;
    }


    public boolean CompFractionNaturel(Fraction f2){
        return this.doubleValue()==f2.doubleValue();
    }

}



