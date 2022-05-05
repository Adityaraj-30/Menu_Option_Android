package in.codingtimes.menu_option_android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ConstraintLayout display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        display = findViewById(R.id.display);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.Red:
                textView.setText("Red");
                display.setBackgroundColor(getResources().getColor(R.color.red));
                break;
            case R.id.Black:
                textView.setText("Black");
                break;
            case R.id.Blue:
                textView.setText("Blue");
                break;
            case R.id.Yellow:
                textView.setText("Yellow");
                break;
            case R.id.Green:
                textView.setText("Green");
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}