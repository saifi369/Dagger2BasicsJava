package com.saifi369.dagger2basicsjava;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.saifi369.dagger2basicsjava.basics.MainViewModel;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=findViewById(R.id.textView);
        Button button=findViewById(R.id.connect);

        mMainViewModel =new MainViewModel();

        button.setOnClickListener(view -> textView.setText(mMainViewModel.fetchData()));

    }
}
