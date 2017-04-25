package rmuti.lab04;

import rmuti.lab04.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
    	ArrayList lst = new ArrayList();
    	lst.add(6);
    	lst.add(12);
    	lst.add(6);
    	lst.add(15);
    	System.out.println(lst);
    	System.out.println(lst.countItem(6));
    	
    }
}
