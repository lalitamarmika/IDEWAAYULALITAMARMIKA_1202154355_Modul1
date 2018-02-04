package android.lalita.com.IDEWAAYULALITAMARMIKA_1202154355_Modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView menu2;
    TextView amount2;
    TextView price;
    TextView where;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String xMenu2= intent.getStringExtra("menu");
        String xAmount2 = intent.getStringExtra("amount");
        String xPrice= intent.getStringExtra("price");
        String xWhere = intent.getStringExtra("where");

        int totalPrice = Integer.valueOf(xPrice)*Integer.valueOf(xAmount2);

        menu2 = (TextView)findViewById(R.id.textInputMenu);
        menu2.setText(xMenu2);

        amount2= (TextView)findViewById(R.id.textInputPorsi);
        amount2.setText(xAmount2);

        price =(TextView)findViewById(R.id.textShowHarga);
        price.setText(String.valueOf(totalPrice));

        where = (TextView)findViewById(R.id.textHeader3);
        where.setText(xWhere);

        if (totalPrice > 65000){
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        }else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
