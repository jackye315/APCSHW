public class ArrayDriver{
    public static void main (String [] args){
	SuperArray a;
        a=new SuperArray(5);
	//System.out.println(a.toString());
	//System.out.println(a.size());
       	a.resize(6);
        //System.out.println(a.size());
	a.add(10);
	a.add(30);
	a.add(5);
	
	for(int x=0;x<8;x++){
	    try{
		System.out.println(a.get(x));
		
	    }
	    catch (IndexOutOfBoundsException e){
		System.out.println("Out of bounds, sorry, please get at a smaller index!");
	    }
	}
	for(int x=0;x<8;x++){
	    try{
	        System.out.println(a.set2(x,"hi"));
		
	    }
	    catch (IndexOutOfBoundsException e){
		System.out.println("Out of bounds, sorry,please set again");
	    }
	}
	
	for(int x=0;x<8;x++){
	    try{
	        System.out.println(a.remove(x));
		
	    }
	    catch (IndexOutOfBoundsException e){
		System.out.println("Out of bounds, sorry, you can't remove past the array length...");
	    }
	}

	/*	a.add(20);
	a.add(20);
	a.add(20);
	a.add(20);
	a.add(20);
	a.add(20);
	a.add(20);
	a.add(100);
	*/
	//	System.out.println(a.toString());
	//	a.add(3,15);
	//System.out.println(a.set2(3,7));
	//	System.out.println(a.toString());
	//System.out.println(a.remove(10));
        //System.out.println(a.toString());





    }





}
