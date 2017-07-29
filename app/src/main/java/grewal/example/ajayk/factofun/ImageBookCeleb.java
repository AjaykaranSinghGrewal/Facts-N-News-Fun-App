package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-26.
 */

public class ImageBookCeleb {
    private Integer[] mDogImage = { R.drawable.celeb1, R.drawable.celeb2, R.drawable.celeb3, R.drawable.celeb4, R.drawable.celeb5, R.drawable.celeb6, R.drawable.celeb7, R.drawable.celeb8, R.drawable.celeb9, R.drawable.celeb10, R.drawable.celeb11, R.drawable.celeb12};

    //Methods-actions the objects take
    public int getDogImage() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mDogImage.length);
        int dogImage = mDogImage[randomNumber];
        return dogImage;
    }
}
