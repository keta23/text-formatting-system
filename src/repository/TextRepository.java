package repository;

import model.BoldTextValDecorator;
import model.ItalicTextValDecorator;
import model.Text;
import model.TextValueDecorator;
import model.UnderlineTextValDecorator;

public class TextRepository {

    Text text = new Text();
		
	public Text boldText(Text basetext) {
		TextValueDecorator decorator = new BoldTextValDecorator(basetext);
		System.out.println(decorator.Value());
		return decorator;
	}

	public Text italicText(Text basetext) {
		TextValueDecorator decorator = new ItalicTextValDecorator(basetext);
		System.out.println(decorator.Value());
		return decorator;
	}

	public Text underlineText(Text basetext) {
		TextValueDecorator decorator = new UnderlineTextValDecorator(basetext);
		System.out.println(decorator.Value());
		return decorator;
	}

	public void setInputText(String textVal) {
		 text.setValue(textVal);;
	}

	public Text getText() {
		return text;
	}

}
