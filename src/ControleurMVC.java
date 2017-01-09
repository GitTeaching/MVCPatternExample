import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;


public class ControleurMVC implements ActionListener{


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Login Clic!");
	
		SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					MySecondJFrameMVC frame = new MySecondJFrameMVC();
					frame.setVisible(true);
				}
		});
		
	}
}
