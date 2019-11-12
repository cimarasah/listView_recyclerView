package br.com.rbeninca.listafrutas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

public class ListagemFrutaRecycleView extends AppCompatActivity {

    RecyclerView recyclerview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_fruta_recycle_view);

        FrutaController frutaController = new FrutaController();
        recyclerview = findViewById(R.id.recyclerView);

        recyclerview.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);

        FrutaAdapterRecyclerView frutaAdapterRecyclerView = new FrutaAdapterRecyclerView(
                getApplicationContext(),
                R.layout.template_item_fruta,
                frutaController.FRUTAS
        );
        recyclerview.setAdapter(frutaAdapterRecyclerView);

    }
}
