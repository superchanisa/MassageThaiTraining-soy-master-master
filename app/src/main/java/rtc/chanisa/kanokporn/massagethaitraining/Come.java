package rtc.chanisa.kanokporn.massagethaitraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Come extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.come);
    }

    public void clickNext(View view) {
        startActivity(new Intent(Come.this,MainHub.class));
        finish();

    }

}