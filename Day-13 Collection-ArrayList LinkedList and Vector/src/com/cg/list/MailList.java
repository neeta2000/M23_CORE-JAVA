package com.cg.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
@SuppressWarnings("unused")
class Address
{
	private int plotNo;
	private String Street;
	private String Area;
	private String City;
	private String state;
	public Address(String street, int plotNo, String area, String city, String state) {
		super();
		Street = street;
		this.plotNo = plotNo;
		Area = area;
		City = city;
		this.state = state;
	}
	public Address(int i, String string, String area2, String city2, String state2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() 
	{
		return String.format("Address [Street=%s, plotNo=%s, Area=%s, City=%s, state=%s]", Street, plotNo, Area, City,
				state);
	}
	
	
}
public class MailList {

	public static void main(String[] args)
	{
		LinkedList<Address>obj=new LinkedList<>();
		//add elements to the LL
		obj.add(new Address(121,"Lane no2","Airoli","Navi Mumbai","Maharastra"));
		obj.add(new Address(122,"Lane no3","Nagar"," Mumbai","Maharastra"));
		@SuppressWarnings("rawtypes")
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			Object elem=i.next();
			System.out.println(elem+"\n");
		}
		System.out.println();

	}

}
