public class OrderedSuperArray extends SuperArray{

    public void add(Object o){
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
    public void set(int index, Object o){

    }






}