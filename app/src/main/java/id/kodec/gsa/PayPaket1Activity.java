package id.kodec.gsa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PayPaket1Activity extends AppCompatActivity {

    private Button konfirmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_paket1);

        konfirmasi = findViewById(R.id.konfirmasi);

        konfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PayPaket1Activity.this, SelesaiActivity.class));
            }
        });
    }
}
