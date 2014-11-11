public class ArrayDriver{
    public static void main (String [] args){
	SuperArray a;
        a=new SuperArray(5);
	//System.out.println(a.toString());
	//System.out.println(a.size());
       	a.resize(6);
        //System.out.println(a.size());
	// System.out.println(a.get(3));
	a.add(20);
	a.add(20);
	a.add(20);
	a.add(20);
	a.add(20);
	a.add(20);
	a.add(20);
	a.add(100);
	System.out.println(a.toString());
	a.add(3,15);
	//System.out.println(a.set2(3,7));
	System.out.println(a.toString());
	//System.out.println(a.remove(10));
        //System.out.println(a.toString());





    }





}
