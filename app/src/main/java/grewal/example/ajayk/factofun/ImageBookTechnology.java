package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-19.
 */

public class ImageBookTechnology {
    private Integer[] mTechImage = {R.drawable.tech1, R.drawable.tech2, R.drawable.tech3, R.drawable.tech4, R.drawable.techfront, R.drawable.tech5, R.drawable.tech6, R.drawable.tech7,R.drawable.tech8};

    //Methods-actions the objects take
    public int getTechImage() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mTechImage.length);
        int techImage = mTechImage[randomNumber];
        return techImage;
    }
}
