package model;

public class BoldTextValDecorator  extends TextValueDecorator{
	
	public BoldTextValDecorator(Text text) {
		super(text);
	}
	
	@Override
	public String Value(){
		return "bold value : "+ "\u001B[1m" + text.Value()+ "\u001B[0m";
	}
}
