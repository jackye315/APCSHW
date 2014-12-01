import java.util.*;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Driver{

    public static void main (String []args) throws FileNotFoundException{
	/*
	File text = new File ("WordBank.txt");
	Scanner in = new Scanner (text);
	ArrayList <String> Bank =new ArrayList<String>();

	while (in.hasNext()){
	    Bank.add(in.next());
	    
	}
	System.out.println(Bank);
	System.out.println(Bank.size());
	System.out.println(Bank.get(1));
	*/

	Random rand = new Random();
	int row;
	int col;
	boolean fill;
	fill=true;

	if (args.length<2){
	    row=25;
	    col=25;
	    fill=true;
	}
	else{
	    row=Integer.parseInt(args[0]);
	    col=Integer.parseInt(args[1]);
	}
	if(args.length>=4){
	    if(Integer.parseInt(args[3])==1){
		fill=false;
	    }
	    else{
		fill=true;
	    }
	}
	WordGrid a;
	a=new WordGrid(row,col);
	a.clear();
	a.loadwordsfromfile("WordBank.txt",fill,row-1,col-1);
	System.out.println(a.toString());
	System.out.println(a.wordsinPuzzle());


	/*
	int x=0;
	while (x<Bank.size()){
	    if(rand.nextInt(4)==0){
		int y=0;
		while(y<5){
		    if(a.addWordHorizontal(Bank.get(x),rand.nextInt(20),rand.nextInt(20))){
		 	y=y+5;
		    }
		    else{
			y=y+1;
		    }
		}
	    }
	    else if(rand.nextInt(4)==1){
		int y=0;
		while(y<5){
		    if(a.addWordVertical(Bank.get(x),rand.nextInt(20),rand.nextInt(20))){
			y=y+5;
		    }
		    else{
			y=y+1;
		    }
		}
	    }
	    else if(rand.nextInt(4)==2){
		int y=0;
		while(y<5){
		    if(a.addWordDiagonal(Bank.get(x),rand.nextInt(20),rand.nextInt(20))){
			y=y+5;
		    }
		    else{
			y=y+1;
		    }
		}
	    }
	    else{
		int y=0;
		while(y<5){
		    if(a.addWordotherDiagonal(Bank.get(x),rand.nextInt(20),rand.nextInt(20))){
			y=y+5;
		    }
		    else{
			y=y+1;
		    }
		}
	    }
	    x=x+1;
	}
	System.out.println(a.toString());

    
	*/
    }
}
