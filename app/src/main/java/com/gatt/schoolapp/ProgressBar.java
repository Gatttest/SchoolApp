package com.gatt.schoolapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;

import com.bluehomestudio.progresswindow.ProgressWindow;
import com.bluehomestudio.progresswindow.ProgressWindowConfiguration;

/**
 * Created by Sushil Chaurasiya on 12/03/2018.
 */

public class ProgressBar {


   /* public static ProgressDialog pDialog;
    public static void progressConfigurations(Context context){

        pDialog = new ProgressDialog(context);
        pDialog.setCancelable(false);
    }

    public static void showProgress() {
        pDialog.show();
    }
    public static void hideProgressBar() {
        pDialog.hide();
    }*/


public static ProgressWindow progressWindow;
        public static void progressConfigurations(Context context){
            progressWindow = ProgressWindow.getInstance(context);
            ProgressWindowConfiguration progressWindowConfiguration = new ProgressWindowConfiguration();
            progressWindowConfiguration.backgroundColor = Color.parseColor("#32000000") ;
            progressWindowConfiguration.progressColor = Color.WHITE ;
            progressWindow.setConfiguration(progressWindowConfiguration);
        }

        public static void hideProgressBar() {
            progressWindow.hideProgress();
        }

        public static void showProgress() {
            progressWindow.showProgress();
        }


}
