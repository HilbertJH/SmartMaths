package utar.assignment1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Comparison(View view) {
        Intent intent = new Intent(this, Comparison.class);
        startActivity(intent);
    }

    public void OrderingNumbers(View view) {
        Intent intent = new Intent(this, OrderingNumbers.class);
        startActivity(intent);
    }

        public void ComposingNumbers(View view) {
        Intent intent = new Intent(this, ComposingNumbers.class);
        startActivity(intent);
    }
}