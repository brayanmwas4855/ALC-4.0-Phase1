package co.ke.mojokdevke.alc40brian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button about, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about = findViewById(R.id.about);
        profile = findViewById(R.id.profile);
        about.setOnClickListener(this);
        profile.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.profile: {
                intent = new Intent(this, Profile.class);
                startActivity(intent);
                break;
            }
            case R.id.about: {
                intent = new Intent(this, WebViewActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
