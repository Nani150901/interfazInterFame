import java.awt.*;
import javax.swing.*;

public class botones {
	static	GridBagConstraints gbc= new GridBagConstraints();
	static	GridBagLayout gbl= new GridBagLayout();
	static JPanel p = new JPanel();
public static JPanel Tablas(JPanel pa) {
	JToolBar toolBar = new JToolBar(JToolBar.HORIZONTAL);
	
	JButton btnToolBar1 = new JButton("Add");
	btnToolBar1.setIcon(new ImageIcon("./assets/add.png"));
	toolBar.add(btnToolBar1);
	JButton btnToolBar2 = new JButton("Edit");
	btnToolBar2.setIcon(new ImageIcon("./assets/edit.png"));
	toolBar.add(btnToolBar2);
	JButton btnToolBar3 = new JButton("Back");
	btnToolBar3.setIcon(new ImageIcon("./assets/back.png"));
	toolBar.add(btnToolBar3);
	JButton btnToolBar4 = new JButton("Next");
	btnToolBar4.setIcon(new ImageIcon("./assets/next.png"));
	toolBar.add(btnToolBar4);
	JButton btnToolBar5 = new JButton("List");
	btnToolBar5.setIcon(new ImageIcon("./assets/list.png"));
	toolBar.add(btnToolBar5);
	JButton btnToolBar6 = new JButton("Save");
	btnToolBar6.setIcon(new ImageIcon("./assets/save.png"));
	toolBar.add(btnToolBar6);
	JButton btnToolBar7 = new JButton("Print");
	btnToolBar7.setIcon(new ImageIcon("./assets/print.png"));
	toolBar.add(btnToolBar7);
	JButton btnToolBar8 = new JButton("Test");
	btnToolBar8.setIcon(new ImageIcon("./assets/test.png"));
	toolBar.add(btnToolBar8);
	JButton btnToolBar9 = new JButton("Cancel");
	btnToolBar9.setIcon(new ImageIcon("./assets/cancel.png"));
	toolBar.add(btnToolBar9);
	JButton btnToolBar10 = new JButton("Settings");
	btnToolBar10.setIcon(new ImageIcon("./assets/settings.png"));
	toolBar.add(btnToolBar10);
	JButton btnToolBar11 = new JButton("Delete");
	btnToolBar11.setIcon(new ImageIcon("./assets/delete.png"));
	toolBar.add(btnToolBar11);
	JButton btnToolBar12 = new JButton("Slip");
	btnToolBar12.setIcon(new ImageIcon("./assets/slip.png"));
	toolBar.add(btnToolBar12);
	JButton btnToolBar13 = new JButton("Exit");
	btnToolBar13.setIcon(new ImageIcon("./assets/exit.png"));
	toolBar.add(btnToolBar13);
	pa.add(toolBar);
	return pa;
	}
	
}
