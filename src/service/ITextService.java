package service;

import model.Text;

public interface ITextService {
	Text boldText(Text basetext);
	Text italicText(Text basetext);
	Text underlineText(Text basetext);
}
