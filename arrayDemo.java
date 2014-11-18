public class arrayDemo{

    public boolean contains (int value, int[] q){
    int x=0;
    while(x<q.length){
        if(q[x]==value){
        return true;
        }
        else{
        x=x+1;
        }
    }
    return false;
    }

        public boolean contains (int value, int[][]q){
        int x=0;
        while (x<q.length){
	    int y=0;
            while(y<q[x].length){
		if(q[x][y]==value){
		    return true;
		}
		else{
		    y=y+1;
		}
	    }
            x=x+1;
        }
	return false;
	}

    public static void main(String []args){
    arrayDemo a;
    int []b;
    b=new int [5];
    int [][]c;
    c=new int [3][4];
    c[2][2]=2;
        a=new arrayDemo();
	if( a.contains(0,b)){
	    System.out.println("Value in Array");
	}
	else{
	    System.out.println("Value not in Array");
		}
	if( a.contains(2,c)){
	    System.out.println("Value in Array");
	}
	else{
	    System.out.println("Value not in Array");
		}
    }





   







}
