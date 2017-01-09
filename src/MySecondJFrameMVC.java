
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MySecondJFrameMVC extends JFrame{

	public MySecondJFrameMVC () {
		super();
		initJFrame();
	}
	
	private void initJFrame() {
		this.setSize(500, 400);
		this.setTitle("MySecondJFrame - MVC Pattern");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel panel = new JPanel();
	    this.setContentPane(panel);
	    	    
	    ImageIcon slideimg1 = new ImageIcon("C:/Users/Ordinateur/workspaceJEE/MVCPatternExample/src/icon4.jpg");
        JLabel label = new JLabel(slideimg1);
        panel.add(label);
	}
}
