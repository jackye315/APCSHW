public class SuperArray{
    public String [] data;
    public String []newdata;
    public String []testdata;
    public int numArray;

    public SuperArray(){
	data=new String[10];
	numArray=10;
    }
    public SuperArray(int x){
	data=new String[x];
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

     public void add(String e){
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
	 //data=new String[numArray+1];



    }
    public void add (int index, String o){
	int x=index;
	int y=0;
	newdata=new String [data.length];
	if (data[data.length-1]!=null){
	 int z=data.length+1;
	 resize(z);
	 newdata=new String [data.length];
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
	    newdata=new String [newCapacity];
	    int x=0;
	    while (x<newdata.length){
		newdata[x]=data[x];
		x=x+1;
	    }
	    data=newdata;
	}
	else{
  	    newdata=new String [newCapacity];
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
    public String get(int index){
	if (index>data.length){
	    throw new IndexOutOfBoundsException();
	   
	}
	
            return data[index];
	

    }
    public void set1 (int index, String e){
    data[index]=e;
    }
    public String set2(int index, String o){
	if (index>data.length){
	     throw new IndexOutOfBoundsException();
	}

        String x=data[index];
	data[index]=o;
	return "Being Replaced: "+x;
	

    }
    public String remove(int index){
	if (index>data.length){
            throw new IndexOutOfBoundsException();
	}
       
            int x=index;
	    int y=0;
	    newdata=new String [data.length-1];
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
  public void insertionSort() {
      int x=1;
      while (x < size()) {
	    String a = get(x);
	    int y=x;
	    while (y>0 && a.compareTo(get(y-1)) < 0) {
		set1(y,get(y-1));
		y=y-1;
	       
	    }
	    set1(y,a);
	    x=x+1;
	}
    }

    public int find(String target){//Linear Search
	int x=0;
	while(x<size()){
	    if(get(x).equals(target)){
		return x;
	    }
	    x=x+1;
	}
	return x;
    }
    public void selectionsort(){
	int x=0;
	String temp="";
	while (x<size()){
	    int smallest=x;
	    int y=x+1;
	    while (y<size()){
		if(get(smallest).compareTo(get(y))>0){
		    smallest=y;		    
		}
		y=y+1;
	    }
	    if(smallest!=x){
	        temp=get(x);
		set1(x,get(smallest));
		set1(smallest,temp);
	    }
	    x=x+1;
	}


    }


    public void bubblesort(){
	int x=1;
	int s=size();
	String temp="";
	while (x<s){
	    int y=0;
	    while(y<s-1){
		if(get(y).compareTo(get(y+1))>0){
		    temp=get(y);
		    set1(y,get(y+1));
		    set1(y+1,temp);
		}
		y=y+1;
	    }
	    s=s-1;
	}
    


    }
}

