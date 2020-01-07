package com.saifi369.dagger2basicsjava;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.saifi369.dagger2basicsjava.basics.Constants;
import com.saifi369.dagger2basicsjava.basics.MainViewModel;
import com.saifi369.dagger2basicsjava.di.DaggerMainViewModelInjector;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

import static com.saifi369.dagger2basicsjava.basics.Constants.TAG;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=findViewById(R.id.textView);
        Button button=findViewById(R.id.connect);

        DaggerMainViewModelInjector.builder()
                .setEndPoint(Constants.PROD_ENDPOINT)
                .build()
                .injectFields(this);

        button.setOnClickListener(view -> {
            textView.setText(mMainViewModel.fetchData());
            Log.d(Constants.TAG, "onCreate: Data fetched");
        });

    }

    @Inject
    public void testMethod() {
        Log.d(TAG, "testMethod: this is test method from main activity");
    }

}
