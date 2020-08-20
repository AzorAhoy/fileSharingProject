package networksecurityproject;

import javax.swing.JFileChooser;

public class Test {
	   public static void main (String[] args) {   
	   //load();   
		   FileDialog dialog = new FileDialog("test01"); 
	   }
	   public static void load () {
	      String folder = System.getProperty("./");
	      JFileChooser fc = new JFileChooser(folder);
	      int resultat = fc.showOpenDialog(null);  
	   }
	}