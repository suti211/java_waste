package dustbin;

import garbage.Garbage;
import garbage.PaperGarbage;
import garbage.PlasticGarbage;

import java.io.IOException;
import java.util.ArrayList;

public class Dustbin {
	
	private String color;
	private ArrayList<Garbage> paperContent;
	private ArrayList<Garbage> plasticContent;
	private ArrayList<Garbage> houseWaste;
		
	public Dustbin(String color){
		this.color = color;
		paperContent = new ArrayList<Garbage>();
		plasticContent = new ArrayList<Garbage>();
		houseWaste = new ArrayList<Garbage>();
	}
	
	public void throwOutGarbage(Garbage garbage){
		if(garbage instanceof PlasticGarbage)
			if(((PlasticGarbage) garbage).isClean())
				plasticContent.add(garbage);
			else
				System.err.println("The garbage is dirty! :D");
		if(garbage instanceof PaperGarbage)
			if (((PaperGarbage)garbage).isSqueezed())
				paperContent.add(garbage);
			else
				System.err.println("The paper isn't squeezed");
		
		if(garbage instanceof Garbage)
			houseWaste.add(garbage);
		else
			System.err.println(garbage.getName() + " didn't fit anywhere! :(");
	}
	
	public void emptyContents(){
		paperContent = new ArrayList<Garbage>();
		plasticContent = new ArrayList<Garbage>();
		houseWaste = new ArrayList<Garbage>();
	}

}
