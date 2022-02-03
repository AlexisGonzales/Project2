import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class BulbGUI {

	private JFrame jFrame;
	private JMenuBar jMenuBar;
	private JMenu fileMenu;
	private JMenuItem openFileMenuItem, quitMenuItem;
    private Container container;
    private TextArea unsortedTextArea;
    
    public BulbGUI(){
    	
    	Font font = new Font("Times", Font.BOLD, 20);
    	
    	jFrame = new JFrame();
    	jFrame.setTitle("Unsorted and Sorted Bulbs");
    	jFrame.setLayout(new GridLayout(1,2));
    	
    	jMenuBar = new JMenuBar();
    	fileMenu = new JMenu("File");
    	openFileMenuItem = new JMenuItem("Open File...");
    	quitMenuItem = new JMenuItem("Quit");
    	
    	fileMenu.add(openFileMenuItem);
    	fileMenu.add(quitMenuItem);
    	
    	jMenuBar.add(fileMenu);

        container = jFrame.getContentPane();

        unsortedTextArea = new TextArea();

        unsortedTextArea.setFont(font);
        unsortedTextArea.setEditable(false);

        container.add(unsortedTextArea);
        
        FileMenuHandler fileMenuHandler = new FileMenuHandler(jFrame, unsortedTextArea);
        openFileMenuItem.addActionListener(fileMenuHandler);
        quitMenuItem.addActionListener(fileMenuHandler);

        jFrame.add(jMenuBar);
        jFrame.setJMenuBar(jMenuBar);
        jFrame.setSize(800,600);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
