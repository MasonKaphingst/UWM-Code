public abstract class Thing
{
  private double value;
  
  public abstract Thing clone();
     
  protected void setValue(double value)
  {
    this.value = value;
  }
  
  public double getValue()
  {
    return this.value;
  }
  
  public Thing(double value)
  {
    super();
    this.setValue(value);
  }
  
  public Thing(Thing guest)
  {
    this(guest.getValue());
  }
  
  public boolean equals(Object guest)
  {
    if ( guest == null )
      return false;
    if ( guest == this )
      return true;
    if ( !(guest instanceof Thing) ) 
      return false; 
    
    Thing tg = (Thing)guest;
    return this.getValue() == tg.getValue();
  }
}