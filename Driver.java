public class Driver
{
  public static void main(String[] args)
  {
    Invertable i1 = new Additive(2.0);
    System.out.println("i1.getInverse() : " + i1.getInverse());
    System.out.println();

    System.out.println(Invertable.ADDITIVE);
    System.out.println(Invertable.MULTIPLICATIVE);
    System.out.println();
    
    Thing a1 = new Additive(1.0);
    System.out.println("a1.getValue() : " + a1.getValue());
    Thing a2 = new Additive(2.0);
    Thing m1 = new Multiplicative(2.0);
    Thing m2 = new Multiplicative(4.0);
    System.out.println();
    
    System.out.println("a1 " + a1);
    System.out.println("a2 " + a2);
    System.out.println("m1 " + m1);
    System.out.println("m2 " + m2);
    System.out.println();
    System.out.println("a1.equals(a1) : " + a1.equals(a1));
    System.out.println("a1.equals(a2) : " + a1.equals(a2));
    System.out.println();
    System.out.println("m1.equals(m2) : " + m1.equals(m2));
    System.out.println();
    System.out.println("a2.equals(m1) : " + a2.equals(m1));
    System.out.println("m1.equals(a2) : " + m1.equals(a2));
    System.out.println();
    
    Thing a3 = a2.clone();
    Thing m3 = new Multiplicative( (Multiplicative)m2 );
    System.out.println("a3 " + a3);
    System.out.println("m3 " + m3);
  }
}