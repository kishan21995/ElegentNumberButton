package marketplace.jpr.com.elegentnumberbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class MainActivity extends AppCompatActivity {

    ElegantNumberButton btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (ElegantNumberButton) findViewById(R.id.mybutton);


        btn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num=btn.getNumber();
                Log.e("MIN",num);
            }
        });

    }}
