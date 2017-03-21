package com.example.ilia.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import retrofit2.Call;

import static com.example.ilia.json.RestrofitFactory.retrofitJson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.getJson).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getJson();
            }
        });


    }


    public void getJson() {

        final getJson validator = retrofitJson().create(getJson.class);

        final Call<jsonStruct> call = validator.validate();
        NetworkThread.getInstance().execute(call, new NetworkThread.ExecuteCallback<jsonStruct>() {
            @Override
            public void onSuccess(jsonStruct result) {
                TextView myAwesomeTextView = (TextView)findViewById(R.id.textV);
                myAwesomeTextView.setText(result.toString());
            }

            @Override
            public void onError(Exception ex) {
                //showError(ex);
            }
        });

    }
}
