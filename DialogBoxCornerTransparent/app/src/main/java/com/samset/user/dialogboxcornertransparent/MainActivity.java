package com.samset.user.dialogboxcornertransparent;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDialogbox();
    }

    private void showDialogbox()
    {
        Dialog dialog = new Dialog(this);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.dialog_box, null);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        // This line resolve corner white space
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(view);
        dialog.show();
        dialog.getWindow().setLayout(420,500);
    }
}
