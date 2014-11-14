import java.util.*;
import java.util.Random;
public class ArrayListMethods{
    
    public static void collapseDup(ArrayList<Integer> L){
    int x=0;
    while (x<L.size()-1){
        if (L.get(x)==L.get(x+1)){
        L.remove(x+1);
        }
	else{
        x=x+1;
	}
    }
    }
    Random rand = new Random();
    
    public static void randomize (ArrayList<Integer> A){
	Random rand = new Random();
	int x=0;
	while (x<A.size()-1){
	    int r = rand.nextInt(A.size());
	    int r1=rand.nextInt(A.size());
	    A.add(r,(A.remove(r1)));
	    x=x+1;
	}
    }

    public static void main(String args[]){
	ArrayList<Integer> a=new ArrayList<Integer>();
	ArrayList<Integer> list=new ArrayList<Integer>();
	ArrayListMethods b=new ArrayListMethods();
	
a.add(1); 
a.add(1);
a.add(1);
a.add(1);
a.add(1); 
a.add(1);
a.add(1);
a.add(1);
a.add(2);
a.add(2);  
a.add(2);
a.add(2);
a.add(3); 
a.add(4); 
a.add(5); 
a.add(5);
a.add(5); 
a.add(5);
a.add(6);
a.add(7);
a.add(8); 
System.out.println(a);
b.collapseDup(a);
System.out.println(a);
b.randomize(a);
System.out.println(a);




    }


}






