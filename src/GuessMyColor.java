import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class GuessMyColor extends JFrame{
	

	public GuessMyColor(){	
		
		initGUI();
		
		setTitle("Game Window");
		setSize(200, 100); //pixels
		setResizable(true);
		pack();
		setLocationRelativeTo(null); //centers on screen, do this after packing but before visible

			
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public void initGUI(){
		JLabel titleLabel = new JLabel("Guess My Color");
		add(titleLabel);
		titleLabel.setHorizontalAlignment(JLabel.CENTER); //left or right
	}

	public static void main(String[] args) {
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new GuessMyColor();
            }   
        });

	}

}
