import java.awt.*;
import javax.swing.*;

public class Medio {
	static	GridBagConstraints gbc= new GridBagConstraints();
	static	GridBagLayout gbl= new GridBagLayout();
	static JPanel p = new JPanel();
public static JPanel Tablas(JPanel p) {
		
		p.setLayout(gbl);
		p.setBackground(Color.WHITE);
		JLabel lblP1_1 = new JLabel("Patient ID");
		jPanel(lblP1_1,0,0,1,1, gbl, gbc, p);
		JTextField txtP1_1 = new JTextField(7);
		jPanel(txtP1_1,1,0,2,1, gbl, gbc, p);
		
		JLabel lblP1_2 = new JLabel("Date");
		jPanel(lblP1_2,4,0,1,1, gbl, gbc, p);
		JComboBox comboP1_1 = new JComboBox<String>();
		comboP1_1.addItem("02/12/2012");
		jPanel(comboP1_1,6,0,3,1, gbl, gbc, p);
		
		JLabel lblP1_3 = new JLabel("* Time(hh:mm)");
		jPanel(lblP1_3,9,0,1,1, gbl, gbc, p);
		JTextField txtP1_2 = new JTextField("0",2);
		jPanel(txtP1_2,10,0,1,1, gbl, gbc, p);
		JLabel lblP1_4 = new JLabel(":");
		jPanel(lblP1_4,11,0,1,1, gbl, gbc, p);
		JTextField txtP1_3 = new JTextField("0",2);
		jPanel(txtP1_3,12,0,1,1, gbl, gbc, p);
		
		JLabel lblP1_5 = new JLabel("Lab No");
		jPanel(lblP1_5,14,0,1,1,gbl, gbc, p);
		JTextField txtP1_4 = new JTextField(7);
		jPanel(txtP1_4,15,0,2,1, gbl, gbc, p);
		
		JLabel lblP1_6 = new JLabel("Name");
		jPanel(lblP1_6,0,1,1,1, gbl, gbc, p);
		JComboBox comboP1_2 = new JComboBox<String>();
		comboP1_2.addItem("MR.");
		jPanel(comboP1_2,1,1,1,1, gbl, gbc, p);
		JTextField txtP1_5 = new JTextField();
		jPanel(txtP1_5,2,1,6,1,gbl, gbc, p);
		
		JLabel lblP1_7 = new JLabel("Sex");
		jPanel(lblP1_7,0,2,1,1, gbl, gbc, p);
		JComboBox comboP1_3 = new JComboBox<String>();
		comboP1_3.addItem("MALE");
		jPanel(comboP1_3,1,2,1,1,gbl, gbc, p);
		
		JLabel lblP1_8 = new JLabel("Age");
		jPanel(lblP1_8,2,2,1,1,gbl, gbc, p);
		JTextField txtP1_6 = new JTextField("0",2);
		jPanel(txtP1_6,3,2,1,1, gbl, gbc, p);
		
		JLabel lblP1_9 = new JLabel("Mons");
		jPanel(lblP1_9,4,2,1,1, gbl, gbc, p);
		JTextField txtP1_7 = new JTextField("0",2);
		jPanel(txtP1_7,5,2,1,1, gbl, gbc, p);
		
		JLabel lblP1_10 = new JLabel("Days");
		jPanel(lblP1_10,6,2,1,1, gbl, gbc, p);
		JTextField txtP1_8 = new JTextField("0",2);
		jPanel(txtP1_8,7,2,1,1, gbl, gbc, p);

		JLabel lblP1_11 = new JLabel("Sample By");
		jPanel(lblP1_11,9,2,1,1, gbl, gbc, p);
		JTextField txtP1_9 = new JTextField(8);
		jPanel(txtP1_9,10,2,4,1, gbl, gbc, p);
		
		JLabel lblP1_12 = new JLabel("Referred By");
		jPanel(lblP1_12,0,3,1,1, gbl, gbc, p);
		JTextField txtP1_10 = new JTextField();
		jPanel(txtP1_10,1,3,2,1, gbl, gbc, p);
		JTextField txtP1_11 = new JTextField();
		txtP1_11.setEditable(false);
		jPanel(txtP1_11,4,3,4,1, gbl, gbc, p);


		JLabel lblP1_13 = new JLabel("Panel Code");
		jPanel(lblP1_13,9,3,1,1, gbl, gbc, p);
		JTextField txtP1_12 = new JTextField(8);
		jPanel(txtP1_12,10,3,4,1, gbl, gbc, p);

		JLabel lblP1_14 = new JLabel("Panel ID");
		jPanel(lblP1_14,9,4,1,1, gbl, gbc, p);
		JTextField txtP1_13 = new JTextField(8);
		jPanel(txtP1_13,10,4,4,1, gbl, gbc, p);

		JLabel lblP1_15 = new JLabel("e-mail");
		jPanel(lblP1_15,9,5,1,1, gbl, gbc, p);
		JTextField txtP1_14 = new JTextField(8);
		jPanel(txtP1_14,10,5,4,1, gbl, gbc, p);
		return p;
	}
	public static void jPanel(Component c, int x, int y, int w, int h,GridBagLayout gbl, GridBagConstraints gbc, JPanel panel) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(c, gbc);
		panel.add(c);
	}
}
