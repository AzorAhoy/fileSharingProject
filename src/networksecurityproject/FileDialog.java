package networksecurityproject;

import java.awt.Component;
import java.awt.HeadlessException;
import java.io.File;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Wind
 */
public class FileDialog extends JFrame {

    public String choosePath = "";
    public String chooseFileName = "";

    public FileDialog(String user) {
        JFileChooser chooser = new JFileChooser("D:\\Eclipse_Workspace\\fileSharingProject\\" + user){
        	  @Override
        	  protected JDialog createDialog( Component parent ) throws HeadlessException {
        	    JDialog jDialog = super.createDialog( parent );
        	    jDialog.setAlwaysOnTop( true );
        	    return jDialog;
        	  }
        	};
//        int a = chooser.showOpenDialog(this);
        int a = chooser.showOpenDialog(null);
        if (a == JFileChooser.APPROVE_OPTION) {
            choosePath = (chooser.getSelectedFile().getPath());
            chooseFileName = (chooser.getSelectedFile().getName());
        }
        //setVisible(true);

    }
    
    
	   public static void main (String[] args) {   
		   FileDialog dialog = new FileDialog("test01");   
	   }
}