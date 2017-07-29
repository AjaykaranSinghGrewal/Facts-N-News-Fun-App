package grewal.example.ajayk.factofun;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-25.
 */

public class ImageBookIndia {
    private Integer[] mIndiaImage = {R.drawable.india1,R.drawable.india2, R.drawable.india3, R.drawable.india4,R.drawable.india5,R.drawable.india6, R.drawable.india7, R.drawable.indialogo};

    //Methods-actions the objects take
    public int getIndiaImage() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mIndiaImage.length);
        int indiaImage = mIndiaImage[randomNumber];
        return indiaImage;
    }
}
