package mains;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Collections;

public class MemoryGame {

    public ImageView zeroZero;
    public ImageView oneZero;
    public ImageView twoZero;
    public ImageView threeZero;
    public ImageView zeroOne;
    public ImageView oneOne;
    public ImageView twoOne;
    public ImageView threeOne;
    public ImageView zeroTwo;
    public ImageView oneTwo;
    public ImageView twoTwo;
    public ImageView threeTwo;
    public ImageView zeroThree;
    public ImageView oneThree;
    public ImageView twoThree;
    public ImageView threeThree;

    private ArrayList<Image> images;
    private boolean uno,dos,tres,quatro,cinco,seis,siete,ocho;

    private static final double INV = 0.0000001, VIS = 100;

    public MemoryGame() {
        images = new Pix().getImageViews();
        Collections.shuffle(images);
    }

    public void initialize(){
        zeroZero.setImage(images.get(0));
        oneZero.setImage(images.get(1));
        twoZero.setImage(images.get(2));
        threeZero.setImage(images.get(3));
        zeroOne.setImage(images.get(4));
        oneOne.setImage(images.get(5));
        twoOne.setImage(images.get(6));
        threeOne.setImage(images.get(7));
        zeroTwo.setImage(images.get(8));
        oneTwo.setImage(images.get(9));
        twoTwo.setImage(images.get(10));
        threeTwo.setImage(images.get(11));
        zeroThree.setImage(images.get(12));
        oneThree.setImage(images.get(13));
        twoThree.setImage(images.get(14));
        threeThree.setImage(images.get(15));

        zeroZero.setOpacity(INV);
        oneZero.setOpacity(INV);
        twoZero.setOpacity(INV);
        threeZero.setOpacity(INV);
        zeroOne.setOpacity(INV);
        oneOne.setOpacity(INV);
        twoOne.setOpacity(INV);
        threeOne.setOpacity(INV);
        zeroTwo.setOpacity(INV);
        oneTwo.setOpacity(INV);
        twoTwo.setOpacity(INV);
        threeTwo.setOpacity(INV);
        zeroThree.setOpacity(INV);
        oneThree.setOpacity(INV);
        twoThree.setOpacity(INV);
        threeThree.setOpacity(INV);
    }

    public void reveal(MouseEvent m) {
        if(m.getSource()==zeroZero){
            System.out.println("0,0");
            zeroZero.setOpacity(VIS);
        }
        if(m.getSource()==oneZero){
            System.out.println("1,0");
            oneZero.setOpacity(VIS);
        }
        if(m.getSource()==twoZero){
            System.out.println("2,0");
            twoZero.setOpacity(VIS);
        }
        if(m.getSource()==threeZero){
            System.out.println("3,0");
            threeZero.setOpacity(VIS);
        }
        if(m.getSource()==zeroOne){
            System.out.println("0,1");
            zeroOne.setOpacity(VIS);
        }
        if(m.getSource()==oneOne){
            System.out.println("1,1");
            oneOne.setOpacity(VIS);
        }
        if(m.getSource()==twoOne){
            System.out.println("2,1");
            twoOne.setOpacity(VIS);
        }
        if(m.getSource()==threeOne){
            System.out.println("3,1");
            threeOne.setOpacity(VIS);
        }
        if(m.getSource()==zeroTwo){
            System.out.println("0,2");
            zeroTwo.setOpacity(VIS);
        }
        if(m.getSource()==oneTwo){
            System.out.println("1,2");
            oneTwo.setOpacity(VIS);
        }
        if(m.getSource()==twoTwo){
            System.out.println("2,2");
            twoTwo.setOpacity(VIS);
        }
        if(m.getSource()==threeTwo){
            System.out.println("3,2");
            threeTwo.setOpacity(VIS);
        }
        if(m.getSource()==zeroThree){
            System.out.println("0,3");
            zeroThree.setOpacity(VIS);
        }
        if(m.getSource()==oneThree){
            System.out.println("1,3");
            oneThree.setOpacity(VIS);
        }
        if(m.getSource()==twoThree){
            System.out.println("2,3");
            twoThree.setOpacity(VIS);
        }if(m.getSource()==threeThree){
            System.out.println("3,3");
            threeThree.setOpacity(VIS);
        }

    }
}
