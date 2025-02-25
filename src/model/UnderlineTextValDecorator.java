package model;

public class UnderlineTextValDecorator extends TextValueDecorator {

	public UnderlineTextValDecorator(Text text) {
		super(text);
	}
	
	@Override
	public String Value(){
		return "underline value:"+ "\u001B[4m" +text.Value()+ "\u001B[0m";
	}

}
