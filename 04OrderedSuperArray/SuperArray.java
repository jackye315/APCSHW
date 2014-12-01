public class SuperArray{
    public Object [] data;
    public Object []newdata;
    public Object []testdata;
    public int numArray;

    public SuperArray(){
	data=new Object[10];
	numArray=10;
    }
    public SuperArray(int x){
	data=new Object[x];
	numArray=x;
    }
    public String toString(){
	int x=0;
        String ans="[";
	while (x<data.length){
	    ans=ans+data[x]+" ";
	    x=x+1;
	}
	ans=ans+"]";
	return ans;
    }

     public void add(Object e){
	 int y=0;
	 if (data[data.length-1]!=null){

	 
	 int z=data.length+1;
	 resize(z);
	 data[z-1]=e;
	 }
	 else{
	
	 int x=0;

	 while (x<data.length){
	     if (data[x]==null){
		 data[x]=e;
		 x=x+data.length;
	     }
	     else{
		 x=x+1;
	     }
	 }
	  }
	 //data=new Object[numArray+1];



    }
    public void add (int index, Object o){
	int x=index;
	int y=0;
	newdata=new Object [data.length];
	if (data[data.length-1]!=null){
	 int z=data.length+1;
	 resize(z);
	 newdata=new Object [data.length];
        newdata[index]=o;
		while (y<index){
		newdata[y]=data[y];
		y=y+1;
	    }
	    while (x<data.length-1){
		newdata[x+1]=data[x];
		x=x+1;
	    }
	
	    data=newdata;
    
	 }
	else{
	newdata[index]=o;
	while (y<index){
		newdata[y]=data[y];
		y=y+1;
	    }
	    while (x<data.length-1){
		newdata[x+1]=data[x];
		x=x+1;
	    }
	    data=newdata;
    }
    }
    public int size(){
	int x=0;
	int ans=0;
	while (x<data.length){
	    ans=ans+1;
	    x=x+1;
	}
	return ans;
    }
    public void resize (int newCapacity){
	if (newCapacity<data.length){
	    newdata=new Object [newCapacity];
	    int x=0;
	    while (x<newdata.length){
		newdata[x]=data[x];
		x=x+1;
	    }
	    data=newdata;
	}
	else{
  	    newdata=new Object [newCapacity];
  	    int x=0;
	    while (x<data.length){
	        newdata[x]=data[x];
	        x=x+1;
	    }
       	    data=newdata;
         }
    }

    public void clear(){
	int x=0;
	while (x<data.length){
	    data[x]=null;
	    x=x+1;
	}
    }
    public Object get(int index){
	if (index>data.length){
	    throw new IndexOutOfBoundsException();
	   
	}
	
            return data[index];
	

    }
    public void set1 (int index, Object e){
    data[index]=e;
    }
    public Object set2(int index, Object o){
	if (index>data.length){
	     throw new IndexOutOfBoundsException();
	}

        Object x=data[index];
	data[index]=o;
	return "Being Replaced: "+x;
	

    }
    public Object remove(int index){
	if (index>data.length){
            throw new IndexOutOfBoundsException();
	}
       
            int x=index;
	    int y=0;
	    newdata=new Object [data.length-1];
	    testdata=data;
	    while (y<index){
		newdata[y]=data[y];
		y=y+1;
	    }
	    while (x<data.length-1){
		newdata[x]=data[x+1];
		x=x+1;
	    }
	    data=newdata;
	    return testdata[index];
	
    }
}
