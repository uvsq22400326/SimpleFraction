public class Main {
    public static void main(String[] args) {
        //test de Fration sans argument
        Fraction f = new Fraction();
        System.out.println(f.toString());

        //test avec seulement le numerateur
        Fraction fN= new Fraction(10);
        System.out.println(fN.toString());

        //test avec num et deno
        Fraction f2= new Fraction(12,2);
        System.out.println(f2.toString());

        System.out.println(f2.doubleValue());

        System.out.println(f.getZERO());
        System.out.println(f.getUN());


        //addition de fraction
        Fraction sum1_N = f.add(fN);
        System.out.println(sum1_N.toString());

        //comparaison naturel entre 2 frac
        System.out.println(f.CompFractionNaturel(fN));



    }
    
    
    
}
