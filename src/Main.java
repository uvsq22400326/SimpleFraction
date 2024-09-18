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

        System.out.println(f.getZERO());
        System.out.println(f.getUN());

    }
    
    
    
}
