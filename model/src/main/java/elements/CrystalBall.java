package elements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class CrystalBall extends Items{
	private int x;
	private int y;
	
	public CrystalBall(int x, int y){
		
		this.x = x;
		this.y = y;
		
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

	public void Image() throws IOException {
		BufferedImage crystal_ball = ImageIO.read(new File("src/main/resources/sprite/crystal_ball.png"));
	}
}
