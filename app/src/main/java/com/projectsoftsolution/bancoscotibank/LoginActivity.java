package com.projectsoftsolution.bancoscotibank;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginActivity extends AppCompatActivity {

    EditText txtDni;
    EditText txtPass;
    Button btnIngresar;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnIngresar=(Button)findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
        btnCancelar=(Button)findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public Connection conexionBD(){
        Connection conexion = null;
        try{
            StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbd:jtds:sqlserver://dbbancoscoti.cauo5gird7t7.us-east-2.rds.amazonaws.com;databaseName=dbBancoScotiApp;user=masterScotiabank;password=159734862;");
        }catch(Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
        }
        return conexion;
    }

    public void IniciarSesion(){
        txtDni=(EditText) findViewById(R.id.editDni);
        txtPass=(EditText)findViewById(R.id.editPass);
        try {
            PreparedStatement pst=conexionBD().prepareStatement("select PASSWORD from LOGIN where CODCLI = ?");
            pst.setString(1,txtDni.getText().toString());
            ResultSet rs = pst.executeQuery();
                /*if (pst = txtPass.getText().toString()) {

                }*/
            } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
