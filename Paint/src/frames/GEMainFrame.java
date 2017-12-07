package frames;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import constants.GEConstants;
import menus.GEMenuBar;

public class GEMainFrame extends JFrame {
	
	private static GEMainFrame uniqueFrame = new GEMainFrame(GEConstants.TITLE_MAINFRAME);
	
	private GEDrawingPanel drawingPanel;
	private GEMenuBar menuBar;
	private GEToolBar toolBar;

	private GEMainFrame(String title) {
		super(title);
		drawingPanel = new GEDrawingPanel();
		menuBar = new GEMenuBar();
		toolBar = new GEToolBar(GEConstants.TITLE_TOOLBAR);
		this.add(drawingPanel);
		this.setJMenuBar(menuBar);
		this.add(BorderLayout.NORTH, toolBar);
	}

	public static GEMainFrame getInstance() {
		return uniqueFrame;
	}

	public void init() {
		toolBar.init(drawingPanel);
		menuBar.init(drawingPanel);
		this.setSize(GEConstants.WIDTH_MAINFRAME, GEConstants.HEIGHT_MAINFRAME);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
