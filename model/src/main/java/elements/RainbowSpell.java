package elements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import contract.Permeability;

public class RainbowSpell extends Mobile {
	private int x;
	private int y;

	public RainbowSpell(int x, int y, char c) {

		switch (c) {
		case 'R':
			this.setX(x--);
			this.setY(y);
			break;

		case 'L':
			this.setX(x++);
			this.setY(y);
			break;

		case 'D':
			this.setY(y--);
			this.setX(x);
			break;

		case 'U':
			this.setY(y++);
			this.setX(x);
			break;
		default:
			break;

		}

	}

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

	public BufferedImage Image1() throws IOException {
		BufferedImage fireball_1 = ImageIO.read(new File("src/main/resources/sprite/fireball_1.png"));
		return fireball_1;
	}

	public BufferedImage Image2() throws IOException {
		BufferedImage fireball_2 = ImageIO.read(new File("src/main/resources/sprite/fireball_2.png"));
		return fireball_2;
	}

	public BufferedImage Image3() throws IOException {
		BufferedImage fireball_3 = ImageIO.read(new File("src/main/resources/sprite/fireball_3.png"));
		return fireball_3;
	}

	public BufferedImage Image4() throws IOException {
		BufferedImage fireball_4 = ImageIO.read(new File("src/main/resources/sprite/fireball_4.png"));
		return fireball_4;
	}

	public BufferedImage Image5() throws IOException {
		BufferedImage fireball_5 = ImageIO.read(new File("src/main/resources/sprite/fireball_5.png"));
		return fireball_5;
	}

	public BufferedImage Image() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

	public void launchSpell() {
		// TODO Auto-generated method stub

	}

	public void move(char c) throws IOException {
		// TODO Auto-generated method stub

	}

	public void move() {
		// TODO Auto-generated method stub
		
	}
}
