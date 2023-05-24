package mouse;


import java.awt.*;
import java.awt.event.*;

public class MouseList extends WindowAdapter implements MouseListener {
	Frame f;
	Label l;

	MouseList(){
		f= new Frame();
		f.setSize(200,200);
		f.setLayout(null);
		init();
		add_comp();
		f.setVisible(true);
	}
	public void init() {
		l= new Label("LABEL");
	
	}
	public void add_comp() {
		l.setBounds(50,50,150,50);
		f.add(l);
		f.addWindowListener(this);
		f.addMouseListener(this);
	}
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	public void mouseEntered(MouseEvent e) {
		f.setBackground(Color.red);
		l.setText("Mouse Entered");
	}
	public void mousePressed(MouseEvent e) {
		f.setBackground(Color.yellow);
		l.setText("Mouse Pressed");
	}
	public void mouseClicked(MouseEvent e) {
		f.setBackground(Color.green);
		l.setText("Mouse Clicked");
	}
	public void mouseReleased(MouseEvent e) {
		f.setBackground(Color.gray);
		l.setText("Mouse Released");
	}
	public void mouseExited(MouseEvent e) {
		f.setBackground(Color.blue);
		l.setText("Mouse Exited");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseList();

	}

}