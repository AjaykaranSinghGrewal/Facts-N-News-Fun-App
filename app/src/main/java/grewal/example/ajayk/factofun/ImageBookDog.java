package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-17.
 */

public class ImageBookDog {

    private Integer[] mDogImage = {R.drawable.pup1, R.drawable.pup2, R.drawable.pup3, R.drawable.pup4, R.drawable.pup5, R.drawable.pup6, R.drawable.pup7, R.drawable.pup8, R.drawable.pup9, R.drawable.pup10, R.drawable.pup11, R.drawable.pup12};

    //Methods-actions the objects take
    public int getDogImage() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mDogImage.length);
        int dogImage = mDogImage[randomNumber];
        return dogImage;
    }
}
