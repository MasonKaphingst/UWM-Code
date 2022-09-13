public class Lab07{
    public abstract class Number{
  public static final String unSet = "Undefined";
  private boolean set;
  
  public Number(){
    this.setSet(false);
  }
//1. it is protected since it uses this.
  protected final void setSet(boolean value){
    this.set = value;
  }

  public final boolean isSet(){
    return this.set;
  }
  
  public boolean equals(Number guest){
    return this == guest;
  }

  public String toString(){
    if (this.isSet())
      return "";
    else
      return Number.unSet;
  }
//2. it is initilizing the double data
//3. 
  public abstract Number division(Number guest);
}

    public class MyDouble extends Number{
  private double data;
  
  public MyDouble(){
    super();
  }

  public MyDouble(double value){
    super();
    this.setData(value);
  }
  
  protected void setData(double value){
    this.data = value;
    super.setSet(true);
  }
  
  public double getData()
  {
    return this.data;
  }
  
  public boolean equals(MyDouble guest){
    return this.getData() == guest.getData();
  }

  public String toString()
  {
    if (isSet())
      return super.toString() + this.getData();
    else
      return super.toString();
  }

  public Number division(Number guest)
  {
    double val;

    if (guest instanceof MyInteger)
      val = this.getData() / ((MyInteger)guest).getData();
    else
      val = this.getData() / ((MyDouble)guest).getData();

    return new MyDouble(val);
  }
}

    public class MyInteger{

    }
    public class Driver{
  public static void main(String[] args)
  {
    MyInteger num1 = new MyInteger();
    System.out.println("num1 = " + num1);
    num1 = new MyInteger(-4);
    MyInteger num2 = new MyInteger(8);

    MyDouble val1 = new MyDouble();
    System.out.println("val1 = " + val1);
    val1 = new MyDouble(2.4);
    MyDouble val2 = new MyDouble(3.6);

    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
    System.out.println("val1 = " + val1);
    System.out.println("val2 = " + val2);

    Number gen1 = num2.division(num1);
    Number gen2 = num1.division(val1);
    Number gen3 = val1.division(num1);
    Number gen4 = val2.division(val1);

    System.out.println("gen1 = " + gen1);
    System.out.println("gen2 = " + gen2);
    System.out.println("gen3 = " + gen3);
    System.out.println("gen4 = " + gen4);
  }
}

}