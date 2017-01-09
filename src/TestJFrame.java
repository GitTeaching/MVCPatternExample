import javax.swing.SwingUtilities;


public class TestJFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MyJFrameMVC frame = new MyJFrameMVC();
				frame.setVisible(true);
			}
		});

	}

}
