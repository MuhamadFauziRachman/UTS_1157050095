package com.fauzi.utsmobileprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.LinkedList;

public class ListPertandinganActivity extends AppCompatActivity {

    private final LinkedList<ModelPertandingan> listPertandingan = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private ListPertandinganAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pertandingan);

        Toolbar toolbar = findViewById(R.id.toolbar); //Inisialisasi dan Implementasi id Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("List Match");

        //set data
        listPertandingan.addLast(new ModelPertandingan(
                "Persija",
                " Persib", R.drawable.persija, R.drawable.persib,
                "\n" +
                        "\n" +
                        "Artikel ini telah tayang di Kompas.com dengan judul \"Persib Vs Persija, 44 Pelanggaran, 10 Kartu Kuning, dan 1 Korban Jiwa\", https://bola.kompas.com/read/2018/09/24/05350098/persib-vs-persija-44-pelanggaran-10-kartu-kuning-dan-1-korban-jiwa?page=all.\n" +
                        "Penulis : Jalu Wisnu Wirajati\n" +
                        "Editor : Jalu Wisnu Wirajati"));
        listPertandingan.addLast(new ModelPertandingan(
                "Psms",
                "Arema", R.drawable.psms, R.drawable.arema,
                "SURYAMALANG.COM, KANJURUHAN - Hasil skor akhir Arema FC vs PSMS Medan adalah 5-0.\n" +
                        "\n" +
                        "rema FC meraih kemenangan besar di pertandingan Arema FC vs PSMS Medan berlangsung di Stadion Kanjuruhan Kabupaten Malang pada Minggu sore (28/10/2018).\n" +
                        "\n" +
                        "Gol kemenangan arema FC masing-masing dicetak oleh Dedik Setiawan (7'), Makan Konate (11' dan 39'), Dendi Santoso (23') serta Nur Hardianto (80')\n" +
                        "\n" +
                        "Di menit-menit akhir Arema sebenarnya bisa menang 6-0 ketika mendapat hadiah penalti.\n" +
                        "\n" +
                        "Ta[i ekseskusi Hamka Hamzah  bisa ditahan kiper PSMS Medan.\n" +
                        "\n" +
                        "Pada menit awal jalannya laga, Arema berinisiatif melakukan penyerangan terlebih dulu. Terbukti pada menit ke-3, Tendangan bebas Hamka Hamzah hampir saja membobol gawang PSMS Medan sebelum di blok oleh kiper PSMS Dhika Bayangkara.\n" +
                        "\n" +
                        "Selepas itu, berganti PSMS yang mencoba memberikan tekanan ke gawang Arema, beberapa usaha mereka mampu digagalkan oleh barisan belakang Arema yang dijaga oleh Artur Cunha.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Artikel ini telah tayang di suryamalang.com dengan judul Hasil Skor Akhir Arema FC Vs PSMS Medan Adalah 5-0, Menang Besar di Kandang Tanpa Aremania, http://suryamalang.tribunnews.com/2018/10/28/hasil-skor-akhir-arema-fc-vs-psms-medan-adalah-5-0-menang-besar-di-kandang-tanpa-aremania.\n" +
                        "Penulis: Mochammad Rifky Edgar Hidayatullah\n" +
                        "Editor: Dyan Rekohadi "));
        listPertandingan.addLast(new ModelPertandingan(
                "Sriwijaya",
                "Persib", R.drawable.sriwijaya, R.drawable.persib,
                "Persib kian jumawa dengan status sebagai pemuncak klasemen sementara Liga 1. Sriwijaya FC jadi korban terbaru dari amukan mereka. Sang tamu ditekuk dengan dua gol tanpa balas dalam laga yang berangsung di Stadion Gelora Bandung Lautan Api pada hari Sabtu (4/8/2018) sore lalu.\n" +
                        "\n" +
                        "Maung Bandung tak merubah sama sekali susunan starting eleven. Indra Mustafa tetap menjadi tandem Victor Igbonefo, sementara Patrich Wanggai yang mencuri perhatian pada pekan kemarin juga masih mengisi sektor depan.\n" +
                        "\n" +
                        "Hal tersebut berlaku pula di skuat Sriwijaya FC. Duet palang pintu sekaligus legiun asing anyar Alan Henrique - Goran Ganchev masih dipercaya oleh caretaker Subangkit. Yogi Rahadian lengkapi skema trisula bersama Manuchekhr Dzhalilov serta Esteban Vizcarra."));
        listPertandingan.addLast(new ModelPertandingan(
                "Sriwijaya",
                "Persib", R.drawable.sriwijaya, R.drawable.persib,
                "http://www.tribunnews.com/superskor/2018/11/03/arema-fc-bawa-modal-bagus-saat-tandang-ke-markas-psis-semarang"));
        listPertandingan.addLast(new ModelPertandingan(
                "Sriwijaya",
                "Persib", R.drawable.sriwijaya, R.drawable.persib,
                "http://www.tribunnews.com/superskor/2018/11/03/arema-fc-bawa-modal-bagus-saat-tandang-ke-markas-psis-semarang"));

        mRecyclerView = (RecyclerView) findViewById(R.id.list_pertandingan_cyc);

        mAdapter = new ListPertandinganAdapter(ListPertandinganActivity.this, listPertandingan);

        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
