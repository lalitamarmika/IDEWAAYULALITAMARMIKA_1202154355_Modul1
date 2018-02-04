package android.lalita.com.IDEWAAYULALITAMARMIKA_1202154355_Modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText menu,amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void launchEatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        menu = (EditText) findViewById(R.id.editText);
        String Menu = menu.getText().toString();

        amount = (EditText) findViewById(R.id.editText2);
        String Amount = amount.getText().toString();

        intent.putExtra("menu", Menu);
        intent.putExtra("amount", Amount);
        intent.putExtra("price", "50000");
        intent.putExtra("where", "Eatbus");
        startActivity(intent);
    }

    public void lauchAbnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        menu = (EditText) findViewById(R.id.editText);
        String Menu = menu.getText().toString();

        amount = (EditText) findViewById(R.id.editText2);
        String Amount = amount.getText().toString();

        intent.putExtra("menu", Menu);
        intent.putExtra("amount", Amount);
        intent.putExtra("price", "30000");
        intent.putExtra("where", "Eatbus");

        startActivity(intent);
    }
}
