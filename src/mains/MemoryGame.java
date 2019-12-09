package mains;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Collections;

/**
 * - NO GRAPHICAL USER INTERFACE IS REQUIRED, YOU CAN USE JOPTION PANE
 * - https://www.helpfulgames.com/subjects/brain-training/memory.html
 * - 12 card minimum.
 * - Player selects the first card and then selects the second. If the cards match they stay revealed or you can remove them.
 * - The player must be shown the cards when they make a selection and the cards must be hidden if the player selects the wrong match.
 * - The cards must show up in random order.
 * - fixme If using JOptionPane you don't have to error proof, but you must explain to the user how to input for row and column.
 * - You must have a way to exit the program (JOptionPane Example: type "exit" to exit)
 *
 * fixme CSS file
 * fixme images
 */

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
//    private boolean uno,dos,tres,quatro,cinco,seis,siete,ocho;

    private static final double INV = 0.0000000001, VIS = 100;

    private int cnt = 0;

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
    private ArrayList<ImageView> nut = new ArrayList<>();


    public void reveal(MouseEvent m) {
        ImageView a = (ImageView) m.getSource();
        if(m.getSource()==zeroZero){
            System.out.println("0,0");
            zeroZero.setOpacity(VIS);
            zeroZero.setDisable(true);
        }
        if(m.getSource()==oneZero){
            System.out.println("1,0");
            oneZero.setOpacity(VIS);
            oneZero.setDisable(true);
        }
        if(m.getSource()==twoZero){
            System.out.println("2,0");
            twoZero.setOpacity(VIS);
            twoZero.setDisable(true);
        }
        if(m.getSource()==threeZero){
            System.out.println("3,0");
            threeZero.setOpacity(VIS);
            threeZero.setDisable(true);
        }
        if(m.getSource()==zeroOne){
            System.out.println("0,1");
            zeroOne.setOpacity(VIS);
            zeroOne.setDisable(true);
        }
        if(m.getSource()==oneOne){
            System.out.println("1,1");
            oneOne.setOpacity(VIS);
            oneOne.setDisable(true);
        }
        if(m.getSource()==twoOne){
            System.out.println("2,1");
            twoOne.setOpacity(VIS);
            twoOne.setDisable(true);
        }
        if(m.getSource()==threeOne){
            System.out.println("3,1");
            threeOne.setOpacity(VIS);
            threeOne.setDisable(true);
        }
        if(m.getSource()==zeroTwo){
            System.out.println("0,2");
            zeroTwo.setOpacity(VIS);
            zeroTwo.setDisable(true);
        }
        if(m.getSource()==oneTwo){
            System.out.println("1,2");
            oneTwo.setOpacity(VIS);
        }
        if(m.getSource()==twoTwo){
            System.out.println("2,2");
            twoTwo.setOpacity(VIS);
            twoTwo.setDisable(true);
        }
        if(m.getSource()==threeTwo){
            System.out.println("3,2");
            threeTwo.setOpacity(VIS);
            threeTwo.setDisable(true);
        }
        if(m.getSource()==zeroThree){
            System.out.println("0,3");
            zeroThree.setOpacity(VIS);
            zeroThree.setDisable(true);
        }
        if(m.getSource()==oneThree){
            System.out.println("1,3");
            oneThree.setOpacity(VIS);
            oneThree.setDisable(true);
        }
        if(m.getSource()==twoThree){
            System.out.println("2,3");
            twoThree.setOpacity(VIS);
            twoThree.setDisable(true);
        }if(m.getSource()==threeThree){
            System.out.println("3,3");
            threeThree.setOpacity(VIS);
            threeThree.setDisable(true);
        }
//        nut.add((ImageView) m.getSource());

        if(nut.size()>1){
            oof();
        }
        nut.add((ImageView) m.getSource());
        //fixme 12/8/19 makin sure same img doesnt get selected twice
        //fixme do this by making an arraylist of positions and if the same one is added twice dont let it!!!
        a.setDisable(false);

    }

    public void oof(){
        ImageView one = nut.get(0);
        ImageView two = nut.get(1);

        if(check(one.getImage(),two.getImage())){
            System.out.println("true");
            one.setOpacity(VIS);
            two.setOpacity(VIS);
            one.setDisable(true);
            two.setDisable(true);
            nut.remove(one);
            nut.remove(two);
            cnt++;
            System.out.println(cnt);
        }else{
            one.setOpacity(INV);
            two.setOpacity(INV);
            nut.remove(one);
            nut.remove(two);
        }
    }
    public boolean check(Image i, Image j){
        System.out.println("checking");
        return i.equals(j);
    }
}
