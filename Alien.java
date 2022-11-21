import java.awt.Graphics;

public class Alien extends SpaceCharacter
{
     boolean isVis;
     
    public Alien()
    {
        super();
    }

    public Alien(int x, int y, int w, int h, int s, String u)
    {
        super(x, y, w, h, s, u);
        isVis=true;
        moveRight=true;
    }

    public void mover(){

    }
    public  void move(int direction){
        if(moveLeft==true)
            setX(getX()-getSpeed());
            
        if(moveRight==true)
            setX(getX()+getSpeed());
            
    }
    public void draw(Graphics window){
        window.drawImage(getImage(),getX(),getY(),getWidth(),getHeight(),null);
    }

}
