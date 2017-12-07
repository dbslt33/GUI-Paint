package menus;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import constants.GEConstants;
import constants.GEConstants.EFileMenuItems;

public class GEMenuFile extends JMenu {

	public GEMenuFile(String s) {
		super(s);
		for (EFileMenuItems btn : EFileMenuItems.values()) {
			JMenuItem item = new JMenuItem(btn.toString());
			add(item);
		}
	}
}
