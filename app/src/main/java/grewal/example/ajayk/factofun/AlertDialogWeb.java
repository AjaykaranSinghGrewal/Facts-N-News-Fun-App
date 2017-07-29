package grewal.example.ajayk.factofun;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by ajayk on 2017-07-26.
 */

public class AlertDialogWeb extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity()).setTitle("Leave the App?!").setMessage("Do you wish to navigate to the website?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bbc.com/sport"));
                        startActivity(browserIntent);
                    }
                }).setNegativeButton("No", null);

                android.app.AlertDialog dialog = builder.create();
        return dialog;
    }
}
