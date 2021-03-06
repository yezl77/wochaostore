package ui;

import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ImageButton extends JButton { 
    /**
	 * 
	 */
	private static final long serialVersionUID = 6956635081416350338L;

	public ImageButton(ImageIcon icon) 
    { 
        setSize(icon.getImage().getWidth(null),icon.getImage().getHeight(null)); 
        setIcon(icon); 
        setMargin(new Insets(0,0,0,0)); 
        setIconTextGap(0); 
        setBorderPainted(false); 
        setBorder(null); 
        setText(null); 
    } 
}
