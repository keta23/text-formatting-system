package service;

import model.Text;
import repository.TextRepository;

public class TextService implements ITextService{
	
	TextRepository textrepository = new TextRepository();

	@Override
	public Text boldText(Text basetext) {
		return textrepository.boldText(basetext);
	}

	@Override
	public Text italicText(Text basetext) {
		return textrepository.italicText(basetext);
	}

	@Override
	public Text underlineText(Text basetext) {
		return textrepository.underlineText(basetext);
	}

	public void setInputText(String textVal) {
		 textrepository.setInputText(textVal);
	}

	public Text getText() {
		return textrepository.getText();
	}

}
