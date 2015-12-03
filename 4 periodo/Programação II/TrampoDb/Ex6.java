package TrampoDb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author fabiodiniz
 */
public class Ex6 {
	
	public Ex6(JPanel painel, JFrame janela) throws IOException, URISyntaxException {
		BufferedImage myPicture = ImageIO.read(new File(getClass().getResource("img.jpg").toURI()));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		
		painel.setLayout(new BorderLayout(50, 50));
		painel.setBackground(Color.WHITE);
		painel.removeAll();
		painel.add(picLabel);
		painel.updateUI();
		
		janela.setTitle("To de boa, valeu! :D");
		janela.setLocation(0, 100);
		janela.setSize(597, 597);
	}
}
