public class Sorts{


    public void bubblesort(int[] c){
	int x=1;
	int s=c.length;
	String temp="";
	while (x<s){
	    int y=0;
	    while(y<s-1){
		if(c[y].compareTo(c[y+1])>0){
		    temp=c[y];
		    c[y]=c[y+1];
		    c[y+1]=temp;
		}
		y=y+1;
	    }
	    s=s-1;
	}
    }



    public void selectionsort(int[]c){
	int x=0;
	String temp="";
	while (x<c.length){
	    int smallest=x;
	    int y=x+1;
	    while (y<c.length){
		if(c[smallest].compareTo(c[y])>0){
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


    public void insertionSort(int[]c) {
	int x=1;
	while (x < c.length) {
	    String a = c[x];
	    int y=x;
	    while (y>0 && a.compareTo(c[y-1]) < 0) {
		c[y]=c[y-1];
		y=y-1;
	    }
	    c[y]=a;

	    x=x+1;
	}
    }

}
