import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import static java.awt.Font.PLAIN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class InternalFrames extends JFrame{
	GridBagConstraints gbc= new GridBagConstraints();
	GridBagLayout gbl= new GridBagLayout();
	public InternalFrames() {
		getContentPane().setLayout(gbl); 
        setTitle("Conversoor temperaturas"); 
        setSize(800,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        getContentPane().setBackground(Color.WHITE);
	}
	public void metodoMagico(Component c,int x, int y, int w, int h) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(c, gbc);
	}
	public void JLabel1(JLabel c,String txt,int x, int y, int w, int h) {
		c = new JLabel(txt); //Inicio JLabel
		 c.setOpaque(true); //Para poder darle un color de fondo
		c.setBackground(Color.WHITE); //Color de fondo
		c.setForeground(Color.BLUE); //Color de fuente
		c.setFont(new Font("MONOSPACED", PLAIN, 40)); //Fuente
		c.setHorizontalAlignment(SwingConstants.RIGHT); //Alineamiento horizontal derecha
		metodoMagico(c,x,y,w,h);
        add(c); //Añado el JLabel al JFrame
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
