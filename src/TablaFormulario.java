import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TablaFormulario extends JFrame{
static	GridBagConstraints gbc= new GridBagConstraints();
static	GridBagLayout gbl= new GridBagLayout();
static	JPanel pTabla = new JPanel();
static	JPanel p = new JPanel();
static	String[] titulos = {"Taste ID",
            "Test Name",
            "Rata",
            "Ddisc %",
            "Discount Amount","Taxt(%)","Tax amt"};
static	Object[][] datos = {
		    {"ID", "NOMBRE",
		     "RATE", "DISCO", "DISCO2","TAX","TAX2"},
		};

public static void jPanel(Component c, int x, int y, int w, int h, JPanel panel) {
	gbc.gridx = x;
	gbc.gridy = y;
	gbc.gridwidth = w;
	gbc.gridheight = h;
	gbc.fill = GridBagConstraints.HORIZONTAL;
	gbl.setConstraints(c, gbc);
	panel.add(c);
}
public static void Tablas() {
	pTabla.setLayout(new FlowLayout());
	pTabla.setBackground(Color.WHITE);
	JTable table = new JTable(datos, titulos);
	JScrollPane scrollPane = new JScrollPane(table);
	table.setFillsViewportHeight(true);
	pTabla.setLayout(new BorderLayout());
	pTabla.add(table.getTableHeader(), BorderLayout.PAGE_START);
	pTabla.add(table);
}
public static JPanel PT(JPanel panel) {
	Tablas();
    panel.add(pTabla);
   JPanel pFormulario = new JPanel();
		pFormulario.setLayout(gbl);
		pFormulario.setBackground(Color.BLUE);
		
		JLabel Total = new JLabel("Total Less");
		jPanel(Total,0,0,1,1,  pFormulario);
		JTextField txtTotal = new JTextField(8);
		txtTotal.setBackground(Color.BLUE);
		jPanel(txtTotal,1,0,1,1, pFormulario);
	
		JLabel Lest = new JLabel("Lest Amt.");
		jPanel(Lest,0,1,1,1, pFormulario);
		JTextField txtLest = new JTextField(8);
		txtLest.setBackground(Color.BLUE);
		jPanel(txtLest,1,1,1,1, pFormulario);

		JLabel Concession = new JLabel("Concession");
		jPanel(Concession,0,2,1,1,  pFormulario);
		JTextField txtConcession = new JTextField(8);
		txtConcession.setBackground(Color.BLUE);
		jPanel(txtConcession,1,2,1,1, pFormulario);

		JLabel Home = new JLabel("Home Collection");
		jPanel(Home,0,3,1,1, pFormulario);
		JTextField txtHome = new JTextField(8);
		txtHome.setBackground(Color.BLUE);
		jPanel(txtHome,1,3,1,1,pFormulario);

		JLabel Tax = new JLabel("Tax Amt");
		jPanel(Tax,0,4,1,1, pFormulario);
		JTextField txtTax = new JTextField(8);
		txtTax.setBackground(Color.BLUE);
		jPanel(txtTax,1,4,1,1, pFormulario);

		JLabel Net = new JLabel("Net Amt");
		jPanel(Net,0,5,1,1,pFormulario);
		JTextField txtNet = new JTextField(8);
		txtNet.setBackground(Color.BLUE);
		jPanel(txtNet,1,5,1,1,  pFormulario);

		JLabel Balance = new JLabel("Balance");
		jPanel(Balance,0,6,1,1,pFormulario);
		JTextField txtBalance = new JTextField(8);
		txtBalance.setBackground(Color.BLUE);
		jPanel(txtBalance,1,6,1,1, pFormulario);
		panel.add(pFormulario);
	return panel;
}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TablaFormulario();
			}
		});
	}

}
