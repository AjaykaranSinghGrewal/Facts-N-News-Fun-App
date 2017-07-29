package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-25.
 */

public class ImageBookWorldRecords {
    private Integer[] mWorldImage = {R.drawable.worldrecordslogo, R.drawable.world1, R.drawable.world2, R.drawable.world3, R.drawable.world4, R.drawable.world5};

    //Methods-actions the objects take
    public int getWorldImage() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mWorldImage.length);
        int worldImage = mWorldImage[randomNumber];
        return worldImage;
    }
}
