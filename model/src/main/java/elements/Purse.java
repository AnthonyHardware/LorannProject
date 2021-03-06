package elements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import contract.IElements;
import contract.Permeability;

public class Purse extends Items{
	private int x;
	private int y;
	Permeability perm = Permeability.COLLECTABLE;
	
	public Purse(int x, int y){
		
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

	public BufferedImage Image() throws IOException {
		BufferedImage purse = ImageIO.read(new File("src/main/resources/sprite/purse.png"));
		return purse;
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return this.perm;
	}

	public void move(char c) throws IOException {
		// TODO Auto-generated method stub
		
	}

	public List<IElements> getArimages() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
