package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-19.
 */

public class ImageBookCat {
    private Integer[] mCatImage = {R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5, R.drawable.cat10, R.drawable.cat6, R.drawable.cat7, R.drawable.cat8, R.drawable.cat9};

    //Methods-actions the objects take
    public int getCatImage() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mCatImage.length);
        int catImage = mCatImage[randomNumber];
        return catImage;
    }
}
