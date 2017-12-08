package constants;

import java.awt.Color;

public class GEConstants {
	// GEMainFrame
	public static final int WIDTH_MAINFRAME = 1600;
	public static final int HEIGHT_MAINFRAME = 1000;
	public static final String TITLE_MAINFRAME = "GEFinal";

	// GEMenu
	public static final String TITLE_FILEMENU = "����";
	public static final String TITLE_EDITMENU = "����";
	public static final String TITLE_COLORMENU = "�÷�";

	// GEmenuItems
	public static enum EFileMenuItems {
		���θ����, ����, ����, �ٸ��̸���������, ����
	};

	public static enum EEditMenuItems {
		Undo, Redo, ����, �߶󳻱�, ����, ���̱�, Group, Ungroup
	};

	public static enum EColorMenuItems {
		SetLineColor, ClearLineColor, SetFillColor, ClearFillColor
	};

	// GEToolBar
	public static String TITLE_TOOLBAR = "Shape Tools";

	public static enum EToolBarButtons {
		Select, Rectangle, Line, Ellipse, Polygon
	}

	public static String IMG_URL = "images/";
	public static String TOOLBAR_BTN = ".gif";
	public static String TOOLBAR_BTN_SLT = "SLT.gif";

	// GEDrawingPanel
	public static final Color FOREGROUND_COLOR = Color.BLACK;
	public static final Color BACKGROUND_COLOR = Color.WHITE;
	public static final Color DEFAULT_LINE_COLOR = Color.BLACK;
	public static final Color DEFAULT_FILL_COLOR = Color.WHITE;

	public static enum EState {
		Idle, TwoPointsDrawing, NPointsDrawing, Moving, Resizing, Selecting
	}

	// GEAnchorList
	public static final int ANCHOR_W = 6;
	public static final int ANCHOR_H = 6;
	public static final int RR_OFFSET = 30;
	public static final Color ANCHOR_LINECOLOR = Color.BLACK;
	public static final Color ANCHOR_FILLCOLOR = Color.WHITE;

	public static enum EAnchorTypes {
		NW, NN, NE, WW, EE, SW, SS, SE, RR, NONE
	}

	// GEMenuColor
	public static final String TITLE_FILLCOLOR = "Select Fill Color";
	public static final String TITLE_LINECOLOR = "Select Line Color";

	// GETransformer
	public static final int DEFAULT_DASH_OFFSET = 4;
	public static final int DEFAULT_DASHEDLINE_WIDTH = 1;

}
