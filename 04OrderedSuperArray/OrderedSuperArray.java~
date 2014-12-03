public class OrderedSuperArray extends SuperArray{

    public void add(String o){
	super.add(o);
	int x=0;
	while(x<data.length){
	    if(data[x].compareTo(o)>0){
		super.add(x,o);
		super.remove(data.length);
		x=x+data.length;
	    }
	    x=x+1;
	}
    }
    public void set(int index, String o){

    }




    public static void main (String []args){
	OrderedSuperArray a;
	a=new OrderedSuperArray();
	a.add("hi");





    }





}