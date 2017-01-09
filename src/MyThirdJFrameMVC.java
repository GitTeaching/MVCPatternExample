
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyThirdJFrameMVC extends JFrame{


	public MyThirdJFrameMVC (double montant) {
		super();
		initJFrame(montant);
	}
	
	private void initJFrame(double montant) {
		this.setSize(500, 400);
		this.setTitle("MyJFrame - MVC Pattern");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel panel = new JPanel();
	    this.setContentPane(panel);
	    
	    JLabel label = new JLabel("Montant = " + String.valueOf(montant));
	    panel.add(label);
	  
	}
}
