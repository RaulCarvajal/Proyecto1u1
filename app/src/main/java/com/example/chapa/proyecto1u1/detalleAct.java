package com.example.chapa.proyecto1u1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class detalleAct extends AppCompatActivity {


    private TextView titulo,descipcion;
    private ImageView imagen1;

    private String nombre[]={"Hamburgesa","Hot dog","Papas fritas","Burrito","Pizza"};
    private String descrip[]={"La verdadera hamburguesa, hecha con carne molida y servida en un pan con varios condimentos y vegetales, es definitivamente una invención norteamericana. ",
                              "Bocadillo que se genera con la combinación de una salchicha del tipo salchicha de Frankfurt (frankfurter), o vienesa (wiener) hervida, o frita, servida en un pan con forma alargada que suele acompañarse con algún aderezo como salsa de tomate y mostaza.",
                              "Se preparan cortándose en rodajas o en forma de bastones y friéndolas en aceite caliente hasta que queden doradas, retirándolas del aceite y luego sazonándolas con sal.",
                              "Tortilla de harina de trigo enrollada en forma cilíndrica en la que se rellena de carne asada y frijoles refritos.",
                              "Pan plano horneado elaborado con harina de trigo, sal, agua y levadura, y cubierto con salsa de tomate y otros ingredientes como queso, salami, champiñones, cebolla, jamón o aceitunas."};
    private int imagenes[]={
            R.drawable.hamburguesa,
            R.drawable.hot_dog,
            R.drawable.papas_fritas,
            R.drawable.burrito,
            R.drawable.pizza
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        titulo=(TextView)findViewById(R.id.nombrePlatillo);
        descipcion=(TextView)findViewById(R.id.descripcion);
        imagen1=(ImageView)findViewById(R.id.imagen1);

        int parametro=Integer.parseInt(getIntent().getExtras().getString("parametro"));
        titulo.setText(nombre[parametro]);
        descipcion.setText(descrip[parametro]);
        imagen1.setImageResource(imagenes[parametro]);
        //Toast.makeText(detalleAct.this,parametro+"",Toast.LENGTH_LONG).show();

/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
 */
    }

}
