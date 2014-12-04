import java.util.Arrays;
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
	a.add("a");
	a.add("JI");
	a.add("JI");
	a.add("ks");
	a.add(2,"li");
	String []test;
	test=new String[a.size()];
	int x=0;
	while (x<a.size()){
	    test[x]=a.get(x);
	    x=x+1;
	}
	System.out.println(a);
	a.insertionsort();
	Arrays.sort(test);
	System.out.println(a);
	System.out.println(Arrays.toString(test));
	//a.set(1,"za");
	//a.remove(1);
	
	//System.out.println(a);





    }





}
