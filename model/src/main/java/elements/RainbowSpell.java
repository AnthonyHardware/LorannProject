package elements;

import java.awt.Image;

import javax.swing.ImageIcon;

public class RainbowSpell extends Mobile {

	public RainbowSpell(char c) {
		if (c == 'R') {
			x = Character.getX();

		} else if (c == 'L') {

		} else if (c == 'D') {

		} else if (c == 'U') {

		}

	}

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void Image1() {
		Image image = new ImageIcon("//view//sprite//fireball_1.png").getImage();
	}

	public void Image2() {
		Image image = new ImageIcon("//view//sprite//fireball_2.png").getImage();
	}

	public void Image3() {
		Image image = new ImageIcon("//view//sprite//fireball_3.png").getImage();
	}

	public void Image4() {
		Image image = new ImageIcon("//view//sprite//fireball_4.png").getImage();
	}

	public void Image5() {
		Image image = new ImageIcon("//view//sprite//fireball_5.png").getImage();
	}
}
