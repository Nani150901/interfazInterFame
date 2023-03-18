import static java.awt.Font.PLAIN;
import java.awt.*;
import javax.swing.*;

public class InternalFrames extends JFrame{

	
	JPanel pFinal = new JPanel();
	
	public InternalFrames() {
		// El JFrame con el JDesktopPane
		JFrame v = new JFrame("last master test");
		JDesktopPane dp = new JDesktopPane();
		v.getContentPane().add(dp);
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
		setJMenuBar(menuBar);
		pFinal.add(menuBar);
		pFinal.add(botones.Tablas(botones.p),BorderLayout.WEST);
		pFinal.add(Medio.Tablas(Medio.p),BorderLayout.CENTER);
		pFinal.add(TablaFormulario.PT(Medio.p),BorderLayout.SOUTH);
		pFinal.add(Abajo.PT(Medio.p),BorderLayout.EAST);
		// Se construye el JInternalFrame
		JInternalFrame internal = new JInternalFrame("",true,true,true,true);
		internal.add(pFinal);
		//NOTA: NO LOGRO HACER QUE SE ACOMODEN DONDE YO QUIERO
		internal.pack();
		internal.setResizable(true);
		internal.setClosable(true);
		dp.add(internal);
		
		internal.setVisible(true);
		v.setSize(1000,1000);
		v.setVisible(true);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new InternalFrames();
			}
		});
	}
}
