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
    public static void main (String []args){

	WordGrid a;
	a=new WordGrid(10,10);
	a.clear();

    }
   
   
   
}
