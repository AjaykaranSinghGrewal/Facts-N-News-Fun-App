package grewal.example.ajayk.factofun;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by ajayk on 2017-07-17.
 */

public class ColorWheel {
    private String[] mColors = {
            "#39add1", // light blue
            "#c25975", // mauve
            "#f9845b", // orange
            "#838cc7", // lavender
            "#006666", // purple
            "#53bbb4", // aqua
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7",
            "#5D75D4"// light gray
    };

    //Methods-actions the objects take
    public int getColor() {
        String color;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }

}
