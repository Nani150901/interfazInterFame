import java.awt.*;
import javax.swing.*;
public class Abajo {
	static	GridBagConstraints gbc= new GridBagConstraints();
	static	GridBagLayout gbl= new GridBagLayout();
	static JPanel p = new JPanel();
	public static void Tablas() {
		
		p.setLayout(gbl);
		p.setBackground(Color.WHITE);
	
		JLabel JL1 = new JLabel("Home Collection");
		jPanel(JL1,0,0,1,1, p);
		JTextField txt1 = new JTextField(4);
		jPanel(txt1,1,0,1,1,  p);

		JLabel JL2 = new JLabel("Paid");
		jPanel(JL2,2,0,1,1, p);
		JTextField txt2 = new JTextField("0",4);
		jPanel(txt2,3,0,1,1, p);

		JLabel JL3 = new JLabel("Pay Tipe");
		jPanel(JL3,4,0,1,1,  p);
		JComboBox combo1 = new JComboBox<String>();
		combo1.addItem("CASH");
		jPanel(combo1,5,0,1,1,  p);

		JLabel JL4 = new JLabel("Receipt No.");
		jPanel(JL4,6,0,1,1,p);
		JTextField txt4 = new JTextField(8);
		jPanel(txt4,7,0,1,1, p);
		
		JTextArea txtA1 = new JTextArea(3,3);
		txtA1.setBackground(Color.BLUE);
		txtA1.setText("........................");
		jPanel(txtA1,0,1,10,1,p);
	}
	public static void jPanel(Component c, int x, int y, int w, int h, JPanel panel) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(c, gbc);
		panel.add(c);
	}
	public static JPanel PT(JPanel panel) {
		Tablas();
	    panel.add(p);
		return panel;
	}
}
