import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageEditorFrame extends JFrame{
	public ImageEditorFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("TEST");
		ImageEditorFrame frame = new ImageEditorFrame ();
		frame.setTitle ("Maltees Bildeditor");
	}
}
