package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import contract.*;

/**
 * The Class ViewPanel.
 *
 * @author Cattelan Montes Duffaut | Exia A1 Promo 2015
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame viewFrame;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *            the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *            the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */

	int delay = 1000;

ActionListener taskPerformer = new ActionListener(){
	@Override
	protected void paintComponent(final Graphics graphics) {

		int pixelNumbers = 32;
		List<IElements> Arimages = new ArrayList<IElements>();
		try {
			Arimages = this.viewFrame.getController().getMap1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (IElements obj : Arimages) {

			int x = obj.getX();
			int y = obj.getY();

			obj.setX(x++);

			try {
				graphics.drawImage(obj.Image(), x * pixelNumbers, y * pixelNumbers, this);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		repaint();
	}

};new Timer(delay,taskPerformer).start();

	public void getMessage() {
		// TODO Auto-generated method stub

	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}

	public void moveL() {
		// TODO Auto-generated method stub

	}

	public void moveU() {
		// TODO Auto-generated method stub

	}

	public void moveD() {
		// TODO Auto-generated method stub

	}

	public void moveR() {
		// TODO Auto-generated method stub

	}

	public void launchSpell() {
		// TODO Auto-generated method stub

	}

	public void run() {
		// TODO Auto-generated method stub

	}
}
