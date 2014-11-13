import java.util.*;
public class ArrayDrive{
    // ArrayList<Integer> al=new ArrayList<Integer>();
    public void collapseDup(ArrayList<Integer> L){
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
    

    public static void main(String args[]){
	ArrayList<Integer> a=new ArrayList<Integer>();
	ArrayList<Integer> list=new ArrayList<Integer>();
	ArrayDrive b=new ArrayDrive();
	
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
System.out.println(a);
b.collapseDup(a);
System.out.println(a);




    }


}
