package com.itsshahid.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clickme(View view) {
        final TextView textView= new TextView(MainActivity.this);
        textView.setPadding(5,5,5,5);
        textView.setGravity(Gravity.CENTER);
        textView.setMovementMethod(LinkMovementMethod.getInstance()); textView.setText(Html.fromHtml("<b>Hello Dear</b> <br> You are here because you want to implement html clickable alertdialog <br> goto for more: <a href=https://itsshahid.com> <b>ItsShahid.Com</b></a><br><br>"));
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("This is Tittle"); builder.setIcon(R.drawable.warning_new_builer_alert_24);
        builder.setView(textView);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Ok CLicked", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // do something
                Toast.makeText(MainActivity.this, "Cancel CLicked", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        builder.show();
    }
}