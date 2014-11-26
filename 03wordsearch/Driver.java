public class Driver{

    public static void main (String []args) throws FileNotFoundException{
	File text = new File ("WordBank.txt");
	Scanner in = new Scanner (text);
	ArrayList <String> Bank =new ArrayList<String>();

	while (in.hasNext()){
	    Bank.add(in.next());
	    
	}
	System.out.println(Bank);
	System.out.println(Bank.size());
	System.out.println(Bank.get(1));
	Random rand = new Random();

	WordGrid a;
	a=new WordGrid(25,25);
	a.clear();
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

    }


}
