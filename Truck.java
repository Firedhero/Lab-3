

/**
 * Write a description of class Truck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    private double load;
    public int capacity;
    public Truck(){
    	super();
        load = 0;
        capacity = 0;
        }
    //public String name;
//    public Truck(String owner, int i,String string,double d, double load){
//        super();
//        load = 0;
//        capacity = 0;
//        //this.name=name;
//    }
    
    public Truck(String manuf, int cylin, String name, double loads, int capc){
        this.name=name;
        load = loads;
        capacity = capc;
        this.manuf=manuf;
        this.cylin=cylin;
        
        }   
        
    public Truck(Truck oth){
        super(oth);
        load = oth.load;
        capacity = oth.capacity;
    }
   
	public void setload(double newLoad){
        load = newLoad;
    }
    //changes capacity
    public void setcapacity(int newCap){
        capacity = newCap;
    }
    //calls load
    public double getload(){
        return load;
    }
    //calls capacity
    public int getcapacity(){
        return capacity;
    }
    //adds to string
    public String toString(){
    return super.toString() +" "+ load + " lbs load, " + capacity + " tow";
    }
    public boolean equals(Truck oth)
    {
        return super.equals(oth) && load == oth.load &&capacity == oth.capacity;
    }
    /*public int compareTo(Truck t){
    t.compareTo(oth)>0 ;
    //if Truck a's load capacity is greater than Truck b's
    a.compareTo(b) ==0;
    // if Truck a and Truck b have the same load capacity
    a.compareTo(b) <0 ;
    //if Truck a's load capacity is less than Truck b's
}*/
}