package com.example.aristos.thessieee;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Members extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        //making a new ArrayList (items), with the "Item" class as input
        final ArrayList<Item> items = new ArrayList<Item>();
        //we create new Item objects and add them to our new ArrayList items, in an elegant way :P
        items.add(new Item("Alkis Xatzopoulos", "Advisor Professor", R.drawable.hatzopoulos_foto,"http://ee.auth.gr/school/faculty-staff/electronics-computers-department/hatzopoulos-alkiviadis/"));
        items.add(new Item("Leontios J. Hadjileontiadis", "Counselor ", R.drawable.leodios, "http://psyche.ee.auth.gr/index.php?option=com_content&view=article&id=18%3A2010-10-25-16-52-20&catid=4%3Aproffesors&Itemid=10&lang=en"));
        items.add(new Item("Theodora Kokkinou", "Chair", R.drawable.theodora_red, "https://www.linkedin.com/in/theodora-kokkinou-6399bb13b/"));
        items.add(new Item("Anastasia Ntracha", "Vice Chair", R.drawable.anastasia_dracha, "https://www.linkedin.com/in/anastasiantracha/?locale=en_US"));
        items.add(new Item("Andreas Loutzidis", "Secretary", R.drawable.adreas_lou, "https://www.linkedin.com/in/andreas-loutzidis/?locale=en_US"));
        items.add(new Item("Panagiotis Bamidis", "Treasurer", R.drawable.panayotis_bamidis, "https://www.linkedin.com/in/panbamid/"));
        items.add(new Item("Anastasia Pachni-Tsitiridou", "Member", R.drawable.anastasia_pt, "https://www.linkedin.com/in/aipachni/"));
        items.add(new Item("Konstantinos Alexoglou", "Member", R.drawable.kostas_aleksoglou, "https://www.linkedin.com/in/kostas-alexoglou-b9366392/"));
        items.add(new Item("Thanasis Papazoglou", "Member", R.drawable.thanasis_papa, "https://www.linkedin.com/in/athanasios-papazoglou-2781a5134/"));
        items.add(new Item("Stella Vomva", "Member", R.drawable.stella_vomva, "https://www.linkedin.com/in/stella-vomva-2b5888b9/"));
        items.add(new Item("Kosmas Tsiakas", "Member", R.drawable.kosmas_tsiakas, "https://www.linkedin.com/in/kosmas-tsiakas-4b633a11a/"));
        items.add(new Item("Foteini Lamprouli", "Member", R.drawable.fotini_lambrouli, "https://www.linkedin.com/in/foteini-lamprouli-7a2951b3/"));
        items.add(new Item("Anastasis Papanagnou", "Member", R.drawable.anastasis_panag, "https://www.linkedin.com/in/anastasios-papanagnou-2b2498104/"));
        items.add(new Item("Stathis Dimitriadis", "Member", R.drawable.stathis, "https://www.linkedin.com/in/stathis-dimitriadis-b74ba2b1/"));
        items.add(new Item("Angelos Vasileiadis", "Member", R.drawable.aggelos_vas, "https://www.linkedin.com/in/angelos-vasileiadis-8414b9a8/"));
        items.add(new Item("Periklis Karavangelis", "Member", R.drawable.periklis_kara, "https://www.linkedin.com/in/periklis-karavangelis/"));
        items.add(new Item("George Avgenakis", "Member", R.drawable.giorgos_avge, "https://www.linkedin.com/in/george-avgenakis-6a0a5bb8/"));
        items.add(new Item("Vaggelis Vlastos", "Member", R.drawable.vaggelis, "https://www.linkedin.com/in/vaggelis-vlastos-91679b140/"));
        items.add(new Item("Vasilis Ataloglou", "Member", R.drawable.vasilis_ataloglou, "https://www.linkedin.com/in/vasileios-ataloglou-12bab5129/"));
        items.add(new Item("Giorgos Konstantopoulos", "Member", R.drawable.giorgos_kosta, "https://www.linkedin.com/in/gakonst/"));
        items.add(new Item("Nikos Kalathas", "Member", R.drawable.nikos_kalathas, "https://www.linkedin.com/in/nikolaos-kalathas-a7a068114/"));
        items.add(new Item("John Varvaringos", "Member", R.drawable.varvariggos, "https://www.linkedin.com/in/john-varvaringos-63645a154/?trk=onboarding-landing&dl=no"));
        items.add(new Item("Jason George Velentzas", "Member", R.drawable.vele, "https://www.linkedin.com/in/jason-george-velentzas-abba8a147/"));
        items.add(new Item("Aris Georgoulas", "Member", R.drawable.aris, "https://www.linkedin.com/in/aris-georgoulas-1a71b6134/"));

        //adapter stuff...
        ItemAdapter adapter = new ItemAdapter(this, items, R.color.classic_item);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        //onClickListener for each item in the list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item = items.get(position);
                Intent openWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse(item.getURIparse()));
                startActivity(openWebsite);

            }
        });

    }
}

