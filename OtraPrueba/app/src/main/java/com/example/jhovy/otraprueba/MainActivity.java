package com.example.jhovy.otraprueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void menu(){
        Button boton1 = (Button) findViewById(R.id.button1);
        Button boton2 = (Button) findViewById(R.id.button2);
        boton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view1){

                Intent conexion1=new Intent(getApplicationContext(),http.class);
                startActivity(conexion1);


                       /* Runnable runnable = new Runnable() {
                            @Override
                            public void run() {

                                Intent conexion1=new Intent(getApplicationContext(),http.class);
                                startActivity(conexion1);

                            }
                        };
                        // operations to be performed on a background thread

                        Thread httpThread = new Thread(runnable);
                        httpThread.start();*/
            }



                /*new Thread(new Runnable() {

                    @Override
                    public void run() {
                        //view1.invalidate();*/

            //Intent conexion1=new Intent(getApplicationContext(),http.class);
            //startActivity(conexion1);

               /*     }
                }).start();*/


        });

        boton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view2){
                Intent conexion2=new Intent(getApplicationContext(),ftp.class);
                startActivity(conexion2);
            }


        });


    };
}
