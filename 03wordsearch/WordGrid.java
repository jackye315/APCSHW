public class WordGrid{
    private char[][]data;

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows,int cols){
	data=new char[rows][cols];
    }

    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	int x=0;	
	while(x<data.length){
	    int y=0;
	    while(y<data[x].length){
		data[x][y]=' ';
		y=y+1;
	    }
	    x=x+1;
	}
    }


    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String ans="";
	int x=0;
	while (x<data.length){
	    int y=0;
	    while (y<data[x].length){
		ans=ans+data[x][y]+" ";
		y=y+1;
	    }
	    ans=ans+"\n";
	    x=x+1;
	}
       	
	return ans;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordHorizontal(String word,int row, int col){
	if (word.length()<data[row].length-col+1){
	    int x=col;
	    int y=0;
	    while(y<word.length()){
		if(data[row][x]==' ' || data[row][x]==word.charAt(y)){
		data[row][x]=word.charAt(y);
		y=y+1;
		x=x+1;
		}
		else{
		    return false;
		}
	    }
	}
	else{
	    return false;
	}
	return true;
    }
    public boolean addWordVertical(String word, int row, int col){
	if (word.length()<data.length-row+1){
	    int x=row;
	    int y=0;
	    while(y<word.length()){
		if(data[x][col]==' ' || data[x][col]==word.charAt(y)){
		data[x][col]=word.charAt(y);
		y=y+1;
		x=x+1;
		}
		else{
		    return false;
		}
	    }
	}
	else{
	    return false;
	}
	return true;



    }


    public boolean addWordDiagonal(String word, int row, int col){
	if (word.length()<data.length-row+1 || word.length()<data[row].length-col+1){
	    int x=row;
	    int z=col;
	    int y=0;
	    while(y<word.length()){
		if(data[x][z]==' ' || data[x][z]==word.charAt(y)){
		data[x][z]=word.charAt(y);
		y=y+1;
		z=z+1;
		x=x+1;
		}
		else{
		    return false;
		}
	    }
	}
	else{
	    return false;
	}
	return true;



    }


    //vertical + diagonal should be implemented as well.

    public static void main (String []args){

	WordGrid a;
	a=new WordGrid(4,4);
	a.clear();
	if(a.addWordHorizontal("HII",2,0)){
	    System.out.println("True");
	}
	else{
	    System.out.println("FailLL");
	}
	    
	    a.addWordDiagonal("Hi", 2, 0);
	    a.addWordVertical("Yo",0,3);
	    System.out.println(a.toString());
	
    }
}
