package mx.unam.Elements;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;

import mx.unam.Animation.Animation;

public class BackGround2 {
    private Vector3 position;
    private Texture backTexture;
    private Animation backAnimation;
    private int x, y;

    public BackGround2(int x, int y){
        this.x = x;
        this.y = y;
        position = new Vector3(0,0,0);
        position.set(x, y, 0);
        backTexture = new Texture("fondo3.png");
        backAnimation = new Animation(new TextureRegion(backTexture), 10, 0.3f);
    }

    public void update(float dt){
        backAnimation.update(dt);
    }

    public TextureRegion getFondo() {
        return backAnimation.getFrame();
    }

    public void dispose(){
        backTexture.dispose();
    }
}
