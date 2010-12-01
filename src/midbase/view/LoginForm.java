/**
 * 
 */
package midbase.view;

import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;

/**
 * @author milk
 *
 */
public class LoginForm extends Form {

	public StringItem explanationStringItem;
	public TextField passwordTextField;
	
	public StringItem explanation2StringItem;
	public TextField password2TextField;
	
	public boolean firstTime;
	
	
	/**
	 * @param arg0
	 */
	public LoginForm(boolean firstTimeForm) {
		super("Giri�");
		
		this.firstTime = firstTimeForm;
		
		if (firstTimeForm)				
			initializeFirstTimeForm();
		else
			initializeForm();
	}

	private void initializeFirstTimeForm() {
		this.explanationStringItem = new StringItem("�lk Giri� �ifresi", "�ifrenizi giriniz:");
		this.passwordTextField = new TextField("�ifre", null, 16, TextField.PASSWORD);
		
		this.explanation2StringItem = new StringItem("�lk Giri� �ifresi", "�ifrenizi tekrar giriniz:");
		this.password2TextField = new TextField("�ifre Tekrar", null, 16, TextField.PASSWORD);
				
		this.append(this.explanationStringItem);
		this.append(this.passwordTextField);
		this.append(this.explanation2StringItem);
		this.append(this.password2TextField);
	}

	private void initializeForm() {
		this.explanationStringItem = new StringItem("Giri� �ifresi", "�ifrenizi giriniz:");
		this.passwordTextField = new TextField("�ifre", null, 16, TextField.PASSWORD);
		
		this.append(this.explanationStringItem);
		this.append(this.passwordTextField);		
	}
	
}
