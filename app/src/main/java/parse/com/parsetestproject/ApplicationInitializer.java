package parse.com.parsetestproject;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Sam on 11/3/2015.
 */
public class ApplicationInitializer extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "uFzoeLYXav9PlFEMLAT9esn76xd1i8Y2V1ADYAgR", "rVsBuEs4tXYXmiiL4gEZo4PEbLTSuSitBnMwBnFe");
    }
}