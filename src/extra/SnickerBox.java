package extra;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SnickerBox implements ActionListener {
static int snicker=0;
static int sps=1;
static JFrame frame = new JFrame();
static JPanel panel = new JPanel();
static JButton buttonI = new JButton();
static JButton buttonM = new JButton();
static JButton buttonS = new JButton();
static JPanel buttonPanel=new JPanel();
static  JPanel labelPanel = new JPanel();
static JLabel lbl1 = new JLabel("", JLabel.CENTER);
static JLabel lbl2 = new JLabel("", JLabel.CENTER);
static JLabel lbl3 = new JLabel("", JLabel.CENTER);
static JLabel lbl4 = new JLabel("", JLabel.CENTER);
static int health=20;
static int maxHealth=20;
static String weapon="Fists";
public static void main(String[] args) {
	Point p=lbl2.getLocation();
	int x=10;
	int y=10;
	x=p.x;
	y=p.y;
	frame.setLocation(p);
	lbl2.setLocation(p);
	frame.add(panel);
	frame.setSize(500,500);
	panel.add(lbl1);
	panel.add(lbl2);
	buttonPanel.add(buttonI);
	buttonPanel.add(buttonS);
	buttonPanel.add(buttonM);
	buttonPanel.setBounds(0,0, 0, 0);
	labelPanel.add(lbl3);
	labelPanel.add(lbl4);
	labelPanel.setBounds(0, 0, 0, 0);
	labelPanel.setVisible(false);
	buttonI.setSize(100, 50);
	buttonI.setText("Inventory");
	buttonI.addActionListener(null);
	buttonS.setSize(100, 50);
	buttonS.setText("Shop");
	buttonM.setSize(100, 50);
	buttonM.setText("Map");
	frame.add(labelPanel);
	frame.add(buttonPanel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	panel.setBounds(0, 100, 500, 200);
	frame.setResizable(false);
	frame.setLayout(null);
	for (int i = 1; i > 0;) {
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 snicker=snicker+sps;
    lbl1.setText("You have "+snicker+" snickers     |    ");
    lbl2.setText("Your Snickers/sec: "+sps);
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	lbl3.setText("Weapon: "+weapon);
	lbl4.setText("Health: "+health+"/"+maxHealth);
	labelPanel.setVisible(true);
}
}
