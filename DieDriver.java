public class DieDriver

{

  public static void main(String[] args)

  {

    System.out.println("dieCnt = " + Die.getDieCnt());

    Die d1 = new Die();

    Die d2 = new Die(4);

    Die d3 = new Die(d2);

    Die d4 = d1.clone();

    System.out.println("dieCnt = " + Die.getDieCnt());

 

    System.out.println("d1 = " + d1.getUpSide());

    System.out.println("d2 = " + d2.getUpSide());

    System.out.println("d3 = " + d3.getUpSide());

    System.out.println("d4 = " + d4.getUpSide());

 

    if ( d1.equals(d2) )

      System.out.println("d1 equals d2");

    else

      System.out.println("d1 does not equals d2");

 

    if ( d2.equals(d3) )

      System.out.println("d2 equals d3");

    else

      System.out.println("d2 does not equals d3");

  }

}