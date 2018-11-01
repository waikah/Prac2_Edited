package my.edu.tarc.lab2_2menu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void visitTARC(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.tarc.edu.my"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        } else {
            Log.d("Visit Taruc", "No able to handle intent.");

        }

    }

    public void showDial(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "012-3212"));
        if (getIntent().resolveActivity(getPackageManager())!= null) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "no app to handle this action",Toast.LENGTH_SHORT).show();
        }
    }
    public void showMain(View view){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        startActivity(intent);
    }

    public void showSendTo(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: " + "infotarc.edu.my"));
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }else{
            makeText(this,"no app to handle this intent",Toast.LENGTH_SHORT).show();
        }
    }
}
