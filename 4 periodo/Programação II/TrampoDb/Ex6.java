package TrampoDb;

import TrampoDb.Ex18.MyOval;
import TrampoDb.Ex18.MyRectangle;
import TrampoDb.Ex18.MyLine;
import TrampoDb.Ex18.MyShape;
import TrampoDb.Ex18.DrawPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author fabiodiniz
 */
public class Ex6 {
	private DrawPanel drawPanel;
	private JButton undo, clear;
	private JComboBox colorCombo, shapeCombo;
	private JCheckBox fillBox;
	private JLabel statusLabel;
	
	private Color[] colorArray = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, 
								   Color.CYAN, Color.BLUE, Color.PINK, Color.MAGENTA,
								   Color.WHITE, Color.LIGHT_GRAY, Color.GRAY, Color.DARK_GRAY,
								   Color.BLACK };
	private String[] colorNameArray = { "Vermelho", "Laranja", "Amarelo", "Verde",
										"Ciano", "Azul", "Rosa", "Magenda", 
										"Branco", "Cinza Claro", "Cinza", "Cinza Escuro", 
										"Preto" };
	private MyShape[] shapeArray = { new MyLine(), new MyOval(), new MyRectangle() };
	private String[] shapeNameArray = { "Linha", "Oval", "Retângulo" };
	
	public Ex6(JPanel painel, JFrame janela) throws IOException, URISyntaxException {
		statusLabel = new JLabel( "" );
	
		drawPanel = new DrawPanel( statusLabel );
		
		JPanel pOpc = new JPanel();
		
		undo = new JButton( "Desfazer" );
		undo.addActionListener(
			new ActionListener() {
				public void actionPerformed( ActionEvent e ) {
					drawPanel.clearLastShape();
				}
			}
		);
		pOpc.add( undo );
		
		clear = new JButton( "Limpar" );
		clear.addActionListener(
			new ActionListener() {
				public void actionPerformed( ActionEvent e ) {
					drawPanel.clearDrawing();
				}
			}
		);
		pOpc.add( clear );
		
		colorCombo = new JComboBox( colorNameArray );
		colorCombo.addItemListener(
			new ItemListener() {
				public void itemStateChanged( ItemEvent e ) {
					if ( e.getStateChange() == ItemEvent.SELECTED )
						drawPanel.setCurrentColor( 
							colorArray[ colorCombo.getSelectedIndex() ] );
				}
			}
		);
		pOpc.add( colorCombo );
		
		shapeCombo = new JComboBox( shapeNameArray );
		shapeCombo.addItemListener(
			new ItemListener() {
				public void itemStateChanged( ItemEvent e ) {
					if ( e.getStateChange() == ItemEvent.SELECTED )
						drawPanel.setShapeType( 
							shapeArray[ shapeCombo.getSelectedIndex() ] );
				}
			}
		);
		pOpc.add( shapeCombo );
		
		fillBox = new JCheckBox( "Preenchido", false );
		fillBox.addItemListener(
			new ItemListener() {
				public void itemStateChanged( ItemEvent e ) {
					drawPanel.setFilled( fillBox.isSelected() );
				}
			}
		);
		pOpc.add( fillBox );
		
		drawPanel.setCurrentColor( colorArray[ 0 ] );
		drawPanel.setFilled( fillBox.isSelected() );
		
		painel.setLayout(new BorderLayout());
		painel.removeAll();
		painel.add(pOpc, BorderLayout.NORTH);
		painel.add( statusLabel, BorderLayout.SOUTH );
		painel.add( drawPanel, BorderLayout.CENTER );
		painel.updateUI();
		janela.setTitle("Desenhos em Java");
		janela.setSize(500, 300);
		janela.setLocation(25, 100);
	}
}
