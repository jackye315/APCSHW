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
	super.remove(index);
	add(o);
    }




    public static void main (String []args){
	OrderedSuperArray a;
	a=new OrderedSuperArray(6);
	System.out.println(a.size());
	System.out.println(a);
       	a.add("hi");
	a.add("hi");
	a.add("hi");
	a.add("za");
	a.add("za");
	a.add("YO");
	a.add("za");
	a.add("za");
	a.add("za");
	a.add("a");
	a.add("za");
	a.add("JI");
	a.add("za");
	a.add("JI");
	a.add("za");
	a.add("za");
	a.add("ks");

	System.out.println(a);
	//a.set(1,"za");
	//a.remove(1);
	a.set(1,"bi");
	System.out.println(a);





    }





}
