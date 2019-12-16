package mains;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pix {

    private Image one,one1,two,two1,three,three1,four,four1,five,five1,six,six1,seven,seven1,eight,eight1;
    int selection;
    private ArrayList<Image> images, originals;

    public Pix() {
        String folder = "";
        selection = (int) (Math.random() * 5);
        if (selection == 0) {
            folder = "pipe";
        } else if (selection == 1) {
            folder = "atlas";
        } else if (selection == 2) {
            folder = "river";
        } else if (selection == 3) {
            folder = "hartog";
        } else if (selection == 4) {
            folder = "bean";
        }
        System.out.println(selection + "selection");
        setUpImages(folder);
        setUpArrayList();
    }

    public ArrayList<Image> getOriginals() {
        return originals;
    }

    public ArrayList<Image> getImageViews() {
        return images;
    }

    private void setUpImages(String fName) {
        one = new Image("/pictures/" + fName + "/r1c1.png");
        one1 = one;
        two = new Image("/pictures/" + fName + "/r1c2.png");
        two1 = two;
        three = new Image("/pictures/" + fName + "/r1c3.png");
        three1 = three;
        four = new Image("/pictures/" + fName + "/r1c4.png");
        four1 = four;
        five = new Image("/pictures/" + fName + "/r2c1.png");
        five1 = five;
        six = new Image("/pictures/" + fName + "/r2c2.png");
        six1 = six;
        seven = new Image("/pictures/" + fName + "/r2c3.png");
        seven1 = seven;
        eight = new Image("/pictures/" + fName + "/r2c4.png");
        eight1 = eight;
    }

    private void setUpArrayList() {
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
        originals = (ArrayList<Image>) images.clone();

        Collections.shuffle(images,new Random());
    }
}
