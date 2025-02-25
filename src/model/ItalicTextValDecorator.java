package model;

public class ItalicTextValDecorator extends TextValueDecorator{

	public ItalicTextValDecorator(Text text) {
		super(text);	
	}
	
	@Override
	public String Value(){
		return "Italic value: "+ "\u001B[3m"+text.Value()+ "\u001B[0m";
	}

}
