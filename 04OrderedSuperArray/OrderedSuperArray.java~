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
    public void badInsertionSort(){
        while( this.size() > 0){ 
            add(this.remove(0));
        }
        while(size() > 0){
            this.add(remove(0));
        }
}

    public int find(String target){
	int x=size();
	int y=0;
	while(y<size()){
	    if(get(x/2).compareTo(target)>=0){
		resize(x/2);
		x=x/2;
	    }
	    if(get(x/2).compareTo(target)<0){
		x=x+x/2;
	    }
	    y=y+1;
	}
	    return x;



}

    public static void main (String []args){
	OrderedSuperArray a;
	a=new OrderedSuperArray(6);
	System.out.println(a.size());
	System.out.println(a);
       	a.add("hi");
	//a.add("hi");
	//a.add("hi");
	//a.add("za");
	a.add("za");
	a.add("YO");
	//a.add("za");
	//a.add("za");
	a.add("a");
	//a.add("JI");
	a.add("JI");
	a.add("ks");
	a.add(2,"li");
	/*
	String []test;
	test=new String[a.size()];
	int x=0;
	while (x<a.size()){
	    test[x]=a.get(x);
	    x=x+1;
	}
	*/
	System.out.println(a);
	long startTime = System.currentTimeMillis();
	//a.badInsertionSort();
	a.insertionSort();
	long stopTime = System.currentTimeMillis();
	long runTime = stopTime - startTime;
	System.out.println("Run time: " + runTime);
	
      
	//Arrays.sort(test);
	System.out.println(a);
	//System.out.println(Arrays.toString(test));
	//a.set(1,"za");
	//a.remove(1);
	
	//System.out.println(a);





    }





}
/*Classwork/Homework
1. In order to test thet wo, make a String Array, then use Arrayssort on the new Array. Test the outcomes to a.insertionsort().
2. Ok, I just ran the badInsertionSort(), and it took so much time i had to end the program.
I hope mine is faster...
3. For this, I used the timing methods to see how fast each method ran.
*/
