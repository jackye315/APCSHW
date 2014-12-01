import java.util.*;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordGrid{
    private char[][]data;
    // public long r;
    Random rand=new Random();
   
    ArrayList<String> words=new ArrayList<String>();

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    // public void setSeed(long seed){
    //	r=seed;

    // }
    //Random rand = new Random(3);
    public WordGrid(int rows,int cols,long seed){
	data=new char[rows][cols];
	this.rand=new Random(seed);
    }

    /**Set all values in the WordGrid to spaces ' '*/
    public void clear(){
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
	if (word.length()<=data[row].length-col){
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
	    addWordHorizontalleft(word,row,col);
	}
	return true;
    }

    public boolean addWordHorizontalleft(String word,int row, int col){
	if (word.length()<=col+1){
	    int x=col;
	    int y=0;
	    while(y<word.length()){
		if(data[row][x]==' ' || data[row][x]==word.charAt(y)){
		data[row][x]=word.charAt(y);
		y=y+1;
		x=x-1;
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
	if (word.length()<=data.length-row+1){
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
	    addWordVerticalup(word,row,col);
	}
	return true;



    }
   public boolean addWordVerticalup(String word, int row, int col){
	if (word.length()<=row+1){
	    int x=row;
	    int y=0;
	    while(y<word.length()){
		if(data[x][col]==' ' || data[x][col]==word.charAt(y)){
		data[x][col]=word.charAt(y);
		y=y+1;
		x=x-1;
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
	if (word.length()<=data.length-row+1 && word.length()<=data[row].length-col+1){
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
	    addWordDiagonalback(word,row,col);
	}
	return true;



    }
   public boolean addWordDiagonalback(String word, int row, int col){
	if (word.length()<=row+1 && word.length()<=col+1){
	    int x=row;
	    int z=col;
	    int y=0;
	    while(y<word.length()){
		if(data[x][z]==' ' || data[x][z]==word.charAt(y)){
		data[x][z]=word.charAt(y);
		y=y+1;
	        
	       
		z=z-1;
		x=x-1;
		
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
    public boolean addWordotherDiagonal(String word, int row, int col){
	if (word.length()<=data[row].length-col && word.length()<=row+1){
	    int x=row;
	    int z=col;
	    int y=0;
	    while(y<word.length()){
		if(data[x][z]==' ' || data[x][z]==word.charAt(y)){
		data[x][z]=word.charAt(y);
		y=y+1;
		z=z+1;
		x=x-1;
		}
		else{
		    return false;
		}
	    }
	}
	else{
	    addWordotherDiagonalback(word,row,col);
	}
	return true;



    }

    public boolean addWordotherDiagonalback(String word, int row, int col){
	if (word.length()<=col+1 || word.length()<=row+1){
	    int x=row;
	    int z=col;
	    int y=0;
	    while(y<word.length()){
		if(data[x][z]==' ' || data[x][z]==word.charAt(y)){
		data[x][z]=word.charAt(y);
		y=y+1;
		z=z-1;
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
    public boolean checkword(String word, int row, int col, int dx, int dy){
	if (dx==0 && dy==0){
	    return false;
	}
	if (row<0 || col<0){
	    return false;
	}
	if (dx!=0 && dx!=1 && dx!=-1 ||dy!=0 && dy!=1 && dy!=-1){
	    return false;
	}
	if (dx==1 && dy==0 && word.length()<data[row].length-col+1){
	    int x=col;
	    int y=0;
	    while (y<word.length()){
		if(data[row][x]==word.charAt(y)||data[row][x]==' '){
			x=x+1;
			y=y+1;
		    }
		    
	        else{
		   return false;
		}
	    }
	    return true;
	}
	if (dx==-1 && dy==0 && word.length()<col){
	    int x=col;
	    int y=0;
	    while (y<word.length()){
		if(data[row][x]==word.charAt(y)||data[row][x]==' '){
			x=x-1;
			y=y+1;
		    }
		    
	        else{
		   return false;
		}
	    }
	    return true;
       
	}
	if (dx==0 && dy==1 && word.length()<data.length-row+1){
	    int x=row;
	    int y=0;
	    while (x<word.length()){
		if(data[x][col]==word.charAt(y)||data[x][col]==' '){
			x=x+1;
			y=y+1;
		    }
		    
	        else{
		   return false;
		}
	    }
	    return true;

	}
	if (dx==0 && dy==-1 && word.length()<row){
	    int x=row;
	    int y=0;
	    while (y<word.length()){
		if(data[x][col]==word.charAt(y)||data[x][col]==' '){
			x=x-1;
			y=y+1;
		    }
		    
	        else{
		   return false;
		}
	    }
	    return true;
	}
	if (dx==1 && dy==1 && word.length()<data.length-row+1 && word.length()<data[row].length-col+1){
	    int x=row;
	    int z=col;
	    int y=0;
	    while (y<word.length()){
		if(data[x][z]==word.charAt(y)||data[x][z]==' '){
			x=x+1;
			z=z+1;
			y=y+1;
		    }
		    
	        else{
		   return false;
		}
	    }
	    return true;
	}
	if (dx==-1 && dy==1 && word.length()<data.length-row+1 && word.length()<col){
	    int x=row;
	    int z=col;
	    int y=0;
	    while (y<word.length()){
		if(data[x][z]==word.charAt(y)||data[x][z]==' '){
			x=x+1;
			z=z-1;
			y=y+1;
		    }
		    
	        else{
		   return false;
		}
	    }
	    return true;
	}
	if (dx==1 && dy==-1 && word.length()<row && word.length()<data[row].length-col+1){
	    int x=row;
	    int z=col;
	    int y=0;
	    while (y<word.length()){
		if(data[x][z]==word.charAt(y)||data[x][z]==' '){
			x=x-1;
			z=z+1;
			y=y+1;
		    }
		    
	        else{
		   return false;
		}
	    }
	    return true;
	}
	if (dx==-1 && dy==-1 && word.length()<row && word.length()<=col){
	    int x=row;
	    int z=col;
	    int y=0;
	    while (y<word.length()){
		if(data[x][z]==word.charAt(y)||data[x][z]==' '){
			x=x-1;
			z=z-1;
			y=y+1;
		    }
		    
	        else{
		   return false;
		}
	    }
	    return true;
	}
	return false;
    }
    public boolean add(String word, int row, int col, int dx, int dy){
	if (checkword(word,row,col,dx,dy)){
		int x=row;
		int z=col;
		int y=0;
		while(y<word.length()){
		    data[x][z]=word.charAt(y);
		    x=x+dy;
		    z=z+dx;
		    y=y+1;
		}
	    }
	else{
	        return false;
       	    }
	return false;
    }
    public void loadwordsfromfile(String filename, boolean fillrandomletters, int num1,int num2)throws FileNotFoundException{
	File text=new File(filename);
	Scanner in =new Scanner (text);
	ArrayList <String> Bank =new ArrayList<String>();
	while (in.hasNext()){
	    Bank.add(in.next());
	    
	}
	int x=0;
	while(x<Bank.size()){
	    int y=0;
	    int r1=rand.nextInt(num1);
	    int r2=rand.nextInt(num2);
	    int r3=rand.nextInt(3)-1;
	    int r4=rand.nextInt(3)-1;
	    while(y<7){
		if(checkword(Bank.get(x),r1,r2,r3,r4)){
		    add(Bank.get(x),r1,r2,r3,r4);
		    words.add(Bank.get(x));
		    y=y+7;
			
		}
		
	       	y=y+1;
	    }
	    x=x+1;
	}
        if(fillrandomletters){
	    int a=0;
	    while(a<data.length){
		int b=0;
		while(b<data[a].length){
		    if(data[a][b]==' '){
			data[a][b]=(char)(rand.nextInt(26)+97);
		    }
		    b=b+1;
		}
		a=a+1;
	    }
	}
	else{
	    int a=0;
	    while(a<data.length){
		int b=0;
		while(b<data[a].length){
		    if(data[a][b]==' '){
			data[a][b]='_';
		    }
		    b=b+1;
		}
		a=a+1;
	    }
	}
    }
    /*
    public void addwordstolist(ArrayList<String> allwords,String word){
	allwords.add(word);
    }
    */
    public String wordsinPuzzle(){

        int x=0;
	String ans="";
	while(x<words.size()){
	    int y=0;
	    while(y<5 && x<words.size()){
		ans=ans+words.get(x)+"          ";
		y=y+1;
		x=x+1;
	    }
	    ans="  "+ans+"\n"+"    ";
	    x=x+1;
	}
	return ans;
    }
		    
}
	    
