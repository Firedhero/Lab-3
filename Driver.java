
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Truck[] truckArray=new Truck[10];
        truckArray[0]=new Truck("Ford", 8 , "John Smith",10000.0 , 20000);
        // Manufacturer -cylinders -owner -load capacity -tow capacity
        truckArray[1]=new Truck("GM" , 6 ,"Mary Jones" , 5000.0 , 10000);
        truckArray[2]=new Truck("Chrysler" , 8 , "Harry Smith", 12000.0 , 25000);
        truckArray[3]=new Truck("Ford", 6 , "Ellen Harris" , 8000.0 , 12000);
        int count = 4;
        //the number of entries in the array
        
        // output array before sort
        for(int i=0;i<count; i++)
        System.out.println(truckArray[i]);
        // sort the array
        System.out.println("-------------------------------");
        sortit(truckArray, count);
        // output array after sort
        for(int i=0;i<count;i++)
        System.out.println(truckArray[i]);
        
    
   
}
    public static void sortit(Truck[] ar, int c){
    //You write the code to sort the array using a
    //sorting algorithm of your choice
    	
    	for(c=0;c<ar.length;c++) {
    		for(c=0;c<ar.length;c++) {
    			
    	}}
    // HINT: you can use the compareTo method.
    // and then look at the code for an array of objects.}
} 

}