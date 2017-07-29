package grewal.example.ajayk.factofun;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by ajayk on 2017-07-23.
 */

public class AlertDialog extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity()).setTitle("Oops Sorry!").setMessage("No Internet Connection. " +
                "Please Try Again").setPositiveButton("OK", null);

        android.app.AlertDialog dialog = builder.create();
        return dialog;
    }
}
