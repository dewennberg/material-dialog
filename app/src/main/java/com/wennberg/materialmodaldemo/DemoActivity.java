package com.wennberg.materialmodaldemo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DemoActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        showAlertDialog();
    }

    private void showAlertDialog() {
        FragmentManager fm = getSupportFragmentManager();
        PhoneNumberDialogFragment alertDialog = PhoneNumberDialogFragment.newInstance("Enter " +
                "phone number");
        alertDialog.show(fm, "phone_number_dialog");
    }

}
