package com.projectsoftsolution.bancoscotibank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button btnCompraDeuda;
    Button btnCloseSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnCompraDeuda=(Button)findViewById(R.id.btnmenu7);
        btnCompraDeuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuActivity.this,CompraDeudaActivity.class);
                startActivity(intent);
            }
        });
        btnCloseSession=(Button)findViewById(R.id.btnmenu8);
        btnCloseSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}
