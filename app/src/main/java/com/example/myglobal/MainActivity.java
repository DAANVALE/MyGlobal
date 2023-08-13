package com.example.myglobal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Video> lstVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstVideo = new ArrayList<>();
        lstVideo.add(new Video(
                "1 - Breaking bad",
                "Suspenso",
                "Walter White un profesor de química de secundaria agobiado por problemas económicos para sostener a su familia y con un cáncer terminal, toma una decisión para ganar dinero y transforma un viejo vehículo en un laboratorio de metanfetaminas rodante.",
                R.drawable.brba
        ));
        lstVideo.add(new Video(
                "2 - Walking Dead",
                "Horror",
                "Tras estar en estado de coma, el expolicía Rick Grimes, descubre que una enfermedad originó un apocalipsis zombi. Rick liderará un grupo de sobrevivientes para buscar un lugar seguro, pero las luchas más peligrosas surgirán entre ellos mismos.",
                R.drawable.wade
        ));
        lstVideo.add(new Video(
                "3 - Lucifer",
                "Fantasía urbana",
                "Harto del infierno, Lucifer abandona su trono en el averno y se marcha a Los Ángeles, donde empieza a trabajar como detective de homicidios.",
                R.drawable.luci
        ));
        lstVideo.add(new Video(
                "4 - Vikings",
                "Drama histórico",
                "Las aventuras de Ragnar Lothbrok, un vikingo agricultor, mientras asciende para convertirse en el rey de los vikingos.",
                R.drawable.viki
        ));
        lstVideo.add(new Video(
                "5 - The umbrella academy",
                "Comedia negra, Drama",
                "Una familia disfuncional de superhéroes se reúne para resolver el misterio de la muerte de su padre y la amenaza del apocalipsis.",
                R.drawable.umac
        ));
        lstVideo.add(new Video(
                "6 - Stranger Things",
                "Terror",
                "Cuando un niño desaparece, sus amigos, la familia y la policía se ven envueltos en una serie de eventos misteriosos al tratar de encontrarlo. Su ausencia coincide con el avistamiento de una criatura terrorífica y la aparición de una extraña niña.",
                R.drawable.stth
        ));
        lstVideo.add(new Video(
                "7 - Seven deadly sins",
                "Anime",
                "Un grupo de tiranos tomó el trono. Ahora la princesa deberá buscar a un grupo de caballeros que la ayude a recuperar el reino.",
                R.drawable.sede
        ));
        lstVideo.add(new Video(
                "8 - Rick and Morty",
                "Comedia nergra, Ciencia",
                "Después de haber estado desaparecido durante casi 20 años, Rick Sánchez llega de imprevisto a la puerta de la casa de su hija Beth y se va a vivir con ella y su familia utilizando el garaje como su laboratorio personal.",
                R.drawable.rimo
        ));
        lstVideo.add(new Video(
                "9 - Peaky Blinders",
                "Drama",
                "Gran Bretaña vive la posguerra. Los soldados regresan, se acuñan nuevas revoluciones y nacen bandas criminales en una nación agitada. En Birmingham, una pandilla de gánsters callejeros asciende hasta convertirse en los reyes de la clase obrera.",
                R.drawable.pelb
        ));
        lstVideo.add(new Video(
                "10 - Black list",
                "Crimen",
                "El ex agente de gobierno y fugitivo Raymond Reddington se entrega al FBI y se compromete a capturar criminales de una lista creada por él mismo. La única condición es que sólo trabajará con la recientemente graduada en Quantico, Elizabeth Keen.",
                R.drawable.blli
        ));
        lstVideo.add(new Video(
                "11 - Friends",
                "Comedia de situación",
                "Las aventuras de seis jóvenes neoyorquinos unidos por una divertida amistad. Entre el amor, el trabajo y la familia, comparten sus alegrías y preocupaciones en el Central Perk, su café favorito.",
                R.drawable.frie
        ));
        lstVideo.add(new Video(
                "12 - BoJack Horseman",
                "Animación",
                "BoJack Horseman es un olvidado actor que supo vivir sus días de gloria gracias a una comedia televisiva, y que se enfrenta a las más duras crisis existenciales y adicciones mientras intenta volver a las grandes ligas.",
                R.drawable.boho
        ));

        RecyclerView myrc = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this, lstVideo);
        myrc.setLayoutManager(new GridLayoutManager(this, 3));
        myrc.setAdapter(myadapter);

    }
}