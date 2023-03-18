import java.awt.*;
import javax.swing.*;


public class Menu extends JFrame {
	
public static JPanel Tablas(JPanel p) {
	JMenuBar menuBar = new JMenuBar();
	JMenu menu1 = new JMenu("Masters");
	menuBar.add(menu1);
	JMenu menu2 = new JMenu("Booking");
	menuBar.add(menu2);
	JMenu menu3 = new JMenu("Test Perform");
	menuBar.add(menu3);
	JMenu menu4 = new JMenu("Printing");
	menuBar.add(menu4);
	JMenu menu5 = new JMenu("Transaction");
	menuBar.add(menu5);
	JMenu menu6 = new JMenu("Lab Reports");
	menuBar.add(menu6);
	JMenu menu7 = new JMenu("Settings");
	menuBar.add(menu7);
	JMenu menu8 = new JMenu("Utilities");
	menuBar.add(menu8);
	JMenu menu9 = new JMenu("Windows");
	menuBar.add(menu9);
	JMenu menu10 = new JMenu("Web");
	menuBar.add(menu10);
	p.add(menuBar);
	return p;
	}
}
