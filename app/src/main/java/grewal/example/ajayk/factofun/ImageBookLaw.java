package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-25.
 */

public class ImageBookLaw {
    private Integer[] mLawImage = {R.drawable.law1, R.drawable.law2,R.drawable.law3,R.drawable.law4,R.drawable.law5,R.drawable.lawlogo };

    //Methods-actions the objects take
    public int getLawImage() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mLawImage.length);
        int lawImage = mLawImage[randomNumber];
        return lawImage;
    }
}
