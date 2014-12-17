import java.util.Random;
import java.util.Arrays;
public class Sorts{

    public Sorts(int num){
	int [] c;
	c=new int [num];
    }
    public static void bubblesort(int[] c){
	int x=1;
	int s=c.length;
	int temp=0;
	while (x<s){
	    int y=0;
	    while(y<s-1){
		if(c[y]>c[y+1]){
		    temp=c[y];
		    c[y]=c[y+1];
		    c[y+1]=temp;
		}
		y=y+1;
	    }
	    s=s-1;
	}
    }



    public static void selectionsort(int[]c){
	int x=0;
	int temp=0;
	while (x<c.length){
	    int smallest=x;
	    int y=x+1;
	    while (y<c.length){
		if(c[smallest]>c[y]){
		    smallest=y;
		}
		y=y+1;
	    }
	    if(smallest!=x){
		temp=c[x];
		c[x]=c[smallest];
		c[smallest]=temp;

	    }
	    x=x+1;
	}
    }


    public static void insertionSort(int[]c) {
	int x=1;
	while (x < c.length) {
	    int a = c[x];
	    int y=x;
	    while (y>0 && a<c[y-1]) {
		c[y]=c[y-1];
		y=y-1;
	    }
	    c[y]=a;

	    x=x+1;
	}
    }
    public String toString(int [] c){
	int x=0;
        String ans="[";
	while (x<c.length){
	    ans=ans+c[x]+" ";
	    x=x+1;
	}
	ans=ans+"]";
	return ans;
    }

    public static void main (String [] args){ 
	Sorts a =new Sorts(10);
	Random r = new Random(1);
	int []c;
	c=new int [10];
	for(int i = 0; i <10 ; i++){
	    c[i]=(r.nextInt(26)+97);
	}
	System.out.println(a.toString(c));
	a.bubblesort(c);
	System.out.println(a.toString(c));
    }



}
