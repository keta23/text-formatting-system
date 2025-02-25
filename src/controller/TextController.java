package controller;

import java.util.Scanner;

import model.Text;
import service.TextService;

public class TextController {
	
	private static  TextController instance = null;
	public TextService textservice = new TextService();
	
	private TextController(){
		
	}
	
	public static  TextController getInstance()
	{
		if(instance == null){
			synchronized (TextController.class) {
				if(instance == null)
					instance = new  TextController();	
			}
		}
		return instance;
	}

	public void runApp() {
		System.out.println("Welcome to text formatting App");
		System.out.println("enter your text value type quit to exit :");
		String textVal = getInputText();
		setInnputText(textVal);
		while (!textVal.equals("quit") ){
			Text basetext = getText();
			System.out.println("Formating Options are: 1. Bold 2. Italic 3. Underline press 0 to exit");
			int formatingOption = getFormatingOption();
			while (formatingOption != 0){
				basetext = performAction(formatingOption,basetext);
				System.out.println("Formating Options are: 1. Bold 2. Italic 3. Underline press 0 to exit");
				formatingOption = getFormatingOption();	
			}
			System.out.println("enter your text value:");
			textVal = getInputText();
			setInnputText(textVal);
		}
			
	}

	private void setInnputText(String textVal) {
		 textservice.setInputText(textVal);	
	}

	private Text getText() {
		return textservice.getText();
	}

	private Text performAction(int formatingOption,Text basetext) {
		switch (formatingOption){
		case 1:
			return boldText(basetext);
		case 2:
			return italicText(basetext);
		case 3:
			return underlineText(basetext);
		}
		return null;
	}

	private Text underlineText(Text basetext) {
		return textservice.underlineText(basetext);
	}

	private Text italicText(Text basetext) {
		return textservice.italicText(basetext);
	}

	private Text boldText(Text basetext) {
		return textservice.boldText(basetext);
	}

	private int getFormatingOption() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private String getInputText() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}
