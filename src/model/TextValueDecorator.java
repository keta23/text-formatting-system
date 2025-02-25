package model;

public abstract class   TextValueDecorator extends Text {
	
	public Text text;
	
	public TextValueDecorator(Text text) {
		super();
		this.text = text;
	}

	@Override
	public String Value(){
		return text.Value();
	}

}
