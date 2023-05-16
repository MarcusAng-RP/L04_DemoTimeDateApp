package sg.edu.rp.c346.id22002222.demotimedateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {


    EditText name;

    EditText phone;

    EditText group;
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.dp);
        tp = findViewById(R.id.tp);
        btnDisplayDate = findViewById(R.id.btnDisplayDate);
        btnDisplayTime = findViewById(R.id.btnDisplayTime);
        btnReset = findViewById(R.id.btnReset);
        tvDisplay = findViewById(R.id.tvDisplay);


        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = tp.getHour();
                int minutes = tp.getMinute();
                tvDisplay.setText("Time is " + hour + " : " + minutes + "0");
            }
        });

        btnDisplayDate.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = dp.getDayOfMonth();
                int month = dp.getMonth() + 1;
                int year = dp.getYear();
                tvDisplay.setText("Date: " + day + "/"+ month + "/" + year);
            }
        }));

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp.updateDate(2022, 0,1);
                tp.setHour(00);
                tp.setMinute(00);


            }
        });
    }
}