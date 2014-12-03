public class OrderedSuperArray extends SuperArray{

    public OrderedSuperArray(int x){
	data=new String[x];
	numArray=x;
    }

    public void add(String o){
	int x=0;
	while(x<data.length){
	    if(data[x]==null){
		x=x+data.length;
		super.add(o);
		return;
	    }
	    else if(data[x].compareTo(o)>0){
		super.add(x,o);
		return;
	    }
	    x=x+1;
	}
    }
    public void set(int index, String o){

    }




    public static void main (String []args){
	OrderedSuperArray a;
	a=new OrderedSuperArray(6);
	System.out.println(a.size());
	System.out.println(a);
       	a.add("hi");
	a.add("hi");
	a.add("hi");
	a.add("hi");
	a.add("YO");
	a.add("a");
	a.add("A");
	System.out.println(a);





    }





}
