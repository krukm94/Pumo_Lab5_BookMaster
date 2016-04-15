package info.ciolek.netthreadapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onThreadClick(View view) {
        startActivity(new Intent(this, ThreadActivity.class));
    }

    public void onAsyncClick(View view) {
        startActivity(new Intent(this, AsyncActivity.class));
    }

    public void onRetrofitClick(View view) {
        startActivity(new Intent(this, RetrofitActivity.class));
    }
}
