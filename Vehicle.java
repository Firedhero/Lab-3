
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
	
    protected String manuf;
    protected int cylin;
    String name;//=new Person();
// = new Person();    //sets Vehicals values to null
    public Vehicle(){
        manuf = "none";
        cylin = 1;
        
        
    }
    public String getName(){
	    return name;
	}
    //changes vehicals values to entered
    public Vehicle(String theMan, int numcylin, String theOwn1){
        
        manuf = theMan;
        cylin = numcylin;
        name = theOwn1;
    }
    public String getOwner() {
	return name;
    }
    //calls
    public Vehicle(Vehicle other){
        manuf = other.manuf;
        cylin = other.cylin;
        name = other.name;
    }
    //cahnges maufactorer
    public void setmf(String newManuf){
        this.manuf = newManuf;
    }
    //changes cylinders
    public void setcd(int newNum){
        this.cylin = newNum;
    }
    //changes the owner
    public void setown(String newOwn){
        this.name=newOwn;//new Person(newOwn);
    }
    //call manufactoer
    public String getmanuf(){
        return manuf;
    }
    //calls cylinders
    public int getcylin(){
        return cylin;
    }
    //calls owner
    public String getown(){
        return name;
    }
    //add to string
    public String toString(){
        return manuf + " manufactor, " + cylin + " cylinders, owned by " + name;
    }
    //tells t/f if similar manufactorer and cylinders
    public boolean equals(Vehicle other){
        return manuf.equals(other.manuf) && cylin == other.cylin;
    }
}