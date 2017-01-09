
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class MyJFrameMVC extends JFrame{


	public MyJFrameMVC () {
		super();
		initJFrame();
	}
	
	private void initJFrame() {
		this.setSize(300, 400);
		this.setTitle("MyJFrame - MVC Pattern");
		this.setLocationRelativeTo(null);
	    
	    JPanel panel = new JPanel();
	    this.setContentPane(panel);
	    	    
	    JTextField textField = new JTextField("Enter your username ...");
	    textField.setColumns(20);
	    textField.setBorder(BorderFactory.createTitledBorder("Username"));
	    panel.add(textField);
	    
	    JPasswordField passwordField = new JPasswordField("Enter your Password");
	    passwordField.setColumns(20);
	    passwordField.setToolTipText("Enter your Password");
	    passwordField.setBorder(BorderFactory.createTitledBorder("Password"));
	    panel.add(passwordField);
	    
	    JButton loginButton = new JButton("Login");
	    
	    loginButton.addActionListener(new ControleurMVCwithWS());
	    panel.add(loginButton);
	    
	    JButton cancelButton = new JButton("Cancel");
	    panel.add(cancelButton);
	}
}
