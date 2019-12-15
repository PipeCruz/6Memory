package mains;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Picture {
    public ImageView zeroZero1;
    public ImageView oneZero1;
    public ImageView twoZero1;
    public ImageView threeZero1;
    public ImageView zeroOne1;
    public ImageView oneOne1;
    public ImageView twoOne1;
    public ImageView threeOne1;

    public Label timeTaken;

    public void initData(String totalTime){
        System.out.println("time taken " + timeTaken);
        timeTaken.setText(totalTime);
    }

    public void initialize(){
        System.out.println("picture has started");
        timeTaken.setText(MemoryGame.getTime());
        zeroZero1.setImage(MemoryGame.getPix().getOriginals().get(0));
        oneZero1.setImage(MemoryGame.getPix().getOriginals().get(2));
        twoZero1.setImage(MemoryGame.getPix().getOriginals().get(4));
        threeZero1.setImage(MemoryGame.getPix().getOriginals().get(6));

        zeroOne1.setImage(MemoryGame.getPix().getOriginals().get(8));
        oneOne1.setImage(MemoryGame.getPix().getOriginals().get(10));
        twoOne1.setImage(MemoryGame.getPix().getOriginals().get(12));
        threeOne1.setImage(MemoryGame.getPix().getOriginals().get(14));

    }


    public void playAgain(MouseEvent mouseEvent) {
    }
}
