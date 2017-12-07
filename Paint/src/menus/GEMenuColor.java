package menus;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import constants.GEConstants;
import constants.GEConstants.EColorMenuItems;
import frames.GEDrawingPanel;

public class GEMenuColor extends JMenu {

	private GEDrawingPanel drawingPanel;

	public GEMenuColor(String label) {
		super(label);
		JMenuItem item;
		for (EColorMenuItems btn : EColorMenuItems.values()) {
			item = new JMenuItem(btn.toString());
			item.addActionListener(new MenuColorHandler());
			item.setActionCommand(btn.toString());
			add(item);
		}
	}

	public void init(GEDrawingPanel drawingPanel) {
		this.drawingPanel = drawingPanel;
	}

	private class MenuColorHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			switch (EColorMenuItems.valueOf(e.getActionCommand())) {
			case SetLineColor:
				setLineColor();
				break;
			case SetFillColor:
				setFillColor();
				break;
			case ClearLineColor:
				clearLineColor();
				break;
			case ClearFillColor:
				clearFillColor();
				break;
			}
		}
	}

	public void setLineColor() {
		Color lineColor = JColorChooser.showDialog(null, GEConstants.TITLE_LINECOLOR, null);
		drawingPanel.setLineColor(lineColor);
	}

	public void clearFillColor() {
		drawingPanel.setFillColor(GEConstants.DEFAULT_FILL_COLOR);

	}

	public void clearLineColor() {
		drawingPanel.setLineColor(GEConstants.DEFAULT_LINE_COLOR);

	}

	public void setFillColor() {
		Color fillColor = JColorChooser.showDialog(null, GEConstants.TITLE_FILLCOLOR, null);
		drawingPanel.setFillColor(fillColor);
	}
}
