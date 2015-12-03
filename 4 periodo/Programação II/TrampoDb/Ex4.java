package TrampoDb;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author fabiodiniz
 */
public class Ex4 {
	private JPanel panel;
	private Box box1, box2, box5, box6, box7;
	private JComboBox combo;

	String names[] = {"High", "Low"};
   
	public Ex4(JPanel painel, JFrame janela){
		painel.setLayout(new BoxLayout(painel, BoxLayout.X_AXIS));

		box1 = Box.createVerticalBox();
		box1.add(new JCheckBox("Image"));
		box1.add(new JCheckBox("Text"));
		box1.add(new JCheckBox("Code"));     

		box2 = Box.createVerticalBox();
		box2.add(new JRadioButton("Selection"));
		box2.add(new JRadioButton("All",true));
		box2.add(new JRadioButton("Applet"));

		Component radioc[] = box2.getComponents();

		ButtonGroup radiobutton = new ButtonGroup();
		for (int i=0; i < radioc.length; i++){
			radiobutton.add((AbstractButton)(radioc[i]));
		}
		
		JPanel box3 = new JPanel();
		box3.setLayout(new GridLayout(4,1,5,5));
		box3.add(new JButton("Ok"));
		box3.add(new JButton("Cancel"));
		box3.add(new JButton("Setup..."));
		box3.add(new JButton("Help"));

		Dimension size = box3.getPreferredSize();
		box3.setMaximumSize(size);

		JPanel box4 = new JPanel();

		box4.setLayout(new FlowLayout());
		box4.add(new JLabel("Print Quality: "));
		box4.add(new JComboBox(names));
		box4.add(new JCheckBox("Print to File"));

		box5 = Box.createHorizontalBox();
		box5.add(Box.createHorizontalGlue());
		box5.add(box1);
		box5.add(Box.createHorizontalStrut(20));
		box5.add(box2);
		box5.add(Box.createHorizontalGlue());

		box6 = Box.createHorizontalBox();
		box6.add(new JLabel("Printer: MyPrinter"));
		box6.add(Box.createHorizontalGlue());     

		box7 = Box.createVerticalBox();
		box7.add(Box.createVerticalGlue());
		box7.add(box6);
		box7.add(box5);
		box7.add(box4);
		box7.add(Box.createVerticalGlue());

		painel.removeAll();
		painel.add(Box.createHorizontalGlue());
		painel.add(box7);
		painel.add(box3); 
		painel.add(Box.createHorizontalGlue());  
		painel.updateUI();

		janela.setTitle("Printer");
		janela.setSize(400, 200);
	}
}
