import java.util.Random;
import java.util.Arrays;
public class OrderedSuperArray extends SuperArray{

    public OrderedSuperArray(int x){
	data=new String[x];
	numArray=x;
    }

    public void add1(String o){
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
    //Changed add to add1 so I could call add from SuperArray
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
	Random r = new Random(1);
	a=new OrderedSuperArray(6);
	System.out.println(a.size());
	System.out.println(a);
	for(int i = 0; i <70000 ; i++){
	    a.add(""+(char)(r.nextInt(26)+97));
	}
	String []test;
	test=new String[a.size()];
	int x=0;
	while (x<a.size()){
	    test[x]=a.get(x);
	    x=x+1;
	}
	/*
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
	*/
	
	
	//System.out.println(a);
	long startTime = System.currentTimeMillis();
	a.insertionSort();
	long stopTime = System.currentTimeMillis();
	long runTime = stopTime - startTime;
	System.out.println("Run time for insertionSort: " + runTime);
	//System.out.println(a);
	

	OrderedSuperArray b;
	b=new OrderedSuperArray(6);
	for(int i = 0; i <70000 ; i++){
	    b.add(""+(char)(r.nextInt(26)+97));
	}
	//System.out.println(a);
	long startTime1 = System.currentTimeMillis();
	b.selectionsort();
	long stopTime1 = System.currentTimeMillis();
	long runTime1 = stopTime1 - startTime1;
	System.out.println("Run time for selectionsort: " + runTime1);

	
	
	long startTime2 = System.currentTimeMillis();
	Arrays.sort(test);
	long stopTime2 = System.currentTimeMillis();
	long runTime2 = stopTime2 - startTime2;
	System.out.println("Run time for Arrays.sort: " + runTime2);
	//System.out.println(a);
	//System.out.println(Arrays.toString(test));
	//wow my functions are so muchs lower than the built in...






    }





}
/*Classwork/Homework
1. In order to test thet wo, make a String Array, then use Arrayssort on the new Array. Test the outcomes to a.insertionsort().
2. Ok, I just ran the badInsertionSort(), and it took so much time i had to end the program.
I hope mine is faster...
3. For this, I used the timing methods to see how fast each method ran.
*/
