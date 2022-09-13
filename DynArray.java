public class DynArray{
    private double[] array;
    private int size;
    private int nextIndex;
    public DynArray(){
        this.size = 1;
        this.nextIndex = 0;
        this.array = new double[1];
    }
    public double[] array(){
        return array;
    }
    
    public int arraySize(){
        return size;
    } 
    public int elements(){
        return nextIndex;
    }
    public void setArray(double array[]){
        this.array = array;
    }
    
    public void setSize(int size){
        this.size = size;
    } 
    public void setElements(int nextIndex){
        this.nextIndex = nextIndex;
    } 
    
    public double at(int index){
        if(0<=index || index<nextIndex){
            return array[index];
        }
        else{
            return Double.NaN;
        }
    }
    
    private void grow(){
        int arraySize = arraySize();
        int newSize = arraySize*2;
        double newArray[];
        newArray = new double[newSize];
        double oldArray[];
        oldArray = array;
        for(int i=0; i<arraySize; i++){
            newArray[i] = oldArray[i];
        }
        setArray(newArray);
        setSize(newSize);
    }
    private void shrink(){
        int arraySize = arraySize();
        int newSize = arraySize/2;
        double newArray[];
        newArray = new double[newSize];
        double oldArray[];
        oldArray = array;
        for(int i=0; i<arraySize; i++){
            newArray[i] = oldArray[i];
        }
        setArray(newArray);
        setSize(newSize);
    }
    public void insertAt(int index, double value){
        int elements = elements();
        int arraySize = arraySize();
        if(0 <= index && index < elements){
            if(elements >= arraySize){
                grow();
            }
            double myArray[];
            myArray = array();
            double tempValue = myArray[index];
            double[] newArray = new double[arraySize];
            for(int i = 0; i < elements; i++){
                if(i != index){
                    newArray[i] = myArray[i];
                    i++;
                    newArray[i] = tempValue;
                }
                else
                    newArray[i] = value;
            }
            setElements(elements);
            setArray(myArray);
            setSize(arraySize);
        }
        
    } 
    public void insert(double value){
        int elements = elements();
        int arraySize = arraySize();
        if(elements >= arraySize){
            grow();
        }
        double myArray[];
        myArray = array();
        myArray[elements] = value;
        elements++;
        setElements(elements);
        setArray(myArray);
        setSize(arraySize);
    }
    
    public double removeAt(int index){
        int elements = elements();
        int arraySize = arraySize();
        double myArray[];
        if(0 <= index && index < elements){
            myArray = array();
            double tempValue = myArray[index];
            for(int i=0; i < elements; i++){
                if(i >= index){
                    int k = i++;
                    myArray[i] = myArray[k];
                }
            }
            if(elements <= (arraySize/2)){
                shrink();
            }
            setElements(elements);
            setArray(myArray);
            setSize(arraySize);
            return tempValue;
            }
            return Double.NaN;
    }
    public double remove(){
        int elements = elements();
        int index = elements -1;
        if (0 <= index && index < elements){
        int arraySize = arraySize();
        double myArray[];
        myArray = array();
        double value = myArray[index];
        myArray[index] = Double.NaN;
        elements--;
        if(elements <= (arraySize/2)){
            shrink();
        }
        setElements(elements);
        setArray(myArray);
        setSize(arraySize);
        return value;
    }
    else 
        return Double.NaN;

       //return index;
    }
    // mutator
    // return the removal of the value at location nextIndex-1.
    public void printArray(){
        int elements = elements();
        double myArray[];
        myArray = array();
        elements--;
        for(int i=0; i <= elements; i++){
            System.out.println("Array.at(" + i + ") = " + myArray[i]);
        }
    }
    //accessor
    // prints the values of all occupied locations of the array to
    // the screen
    }
