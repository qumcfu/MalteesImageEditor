import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageEditorFrame extends JFrame{

	ImageEditorPanel panel;

	public ImageEditorFrame(){
		
		panel = new ImageEditorPanel ();
		setDummyImage ();
		this.add (panel);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("TEST");
		ImageEditorFrame frame = new ImageEditorFrame ();
		frame.setTitle ("Maltees Bildeditor");
	}

	private void setDummyImage(){
		BufferedImage bufferedImage = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
		Graphics g = bufferedImage.getGraphics(); 
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 380, 280); 
		panel.setImage(bufferedImage);
	}
}
