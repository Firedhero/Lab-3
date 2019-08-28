
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    protected String name;
    //initializes name to nothing
	public Person()	{
	    name = "none";
	}
	//sets name value to whatevers entered
	public Person(String theName){
	    name = theName;
	}
	//names the object
	public Person(Person theObject){
	    name = theObject.name;
	}
	//calls what name is
	public String getName(){
	    return name;
	}
	//changes name
	public void setName(String theName){
	    name = theName;
	}
	//sends to string
	public String toString(){
	    return name+" ,";
	}
	//gives a true or false if names are same
	public boolean equals(Object other){
	    return name.equals(((Person)other).name);
	}
}

