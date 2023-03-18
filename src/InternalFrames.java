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
    
		// Se construye el JInternalFrame
		JInternalFrame internal = new JInternalFrame("",true,true,true,true);
		internal.add(Menu.Tablas(TablaFormulario.p));
		internal.add(botones.Tablas(TablaFormulario.p));
		internal.add(Medio.Tablas(TablaFormulario.p));
		internal.add(TablaFormulario.PT(TablaFormulario.p));
		internal.add(Abajo.PT(TablaFormulario.p));
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
