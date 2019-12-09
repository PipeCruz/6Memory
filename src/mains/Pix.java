package mains;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pix {
    private Image one,one1,two,two1,three,three1,four,four1,five,five1,six,six1,seven,seven1,eight,eight1;

    private ArrayList<Image> images;


    public Pix(){
        setUpImages();
        setUpArrayList();
    }

    public ArrayList<Image> getImageViews(){
        return images;
    }

    private void setUpArrayList(){
        images = new ArrayList<>(16);
        images.add(one);
        images.add(one1);
        images.add(two);
        images.add(two1);
        images.add(three);
        images.add(three1);
        images.add(four);
        images.add(four1);
        images.add(five);
        images.add(five1);
        images.add(six);
        images.add(six1);
        images.add(seven);
        images.add(seven1);
        images.add(eight);
        images.add(eight1);
        Collections.shuffle(images,new Random());
    }

    private void setUpImages() {
        one = new Image("/pictures/one.png");
        one1 = one;
        two = new Image("/pictures/two.png");
        two1=two;
        three = new Image("/pictures/three.png");
        three1=three;
        four = new Image("/pictures/four.png");
        four1=four;
        five = new Image("/pictures/five.png");
        five1=five;
        six = new Image("/pictures/six.png");
        six1=six;
        seven = new Image("/pictures/seven.png");
        seven1=seven;
        eight = new Image("/pictures/eight.png");
        eight1=eight;
    }
}
