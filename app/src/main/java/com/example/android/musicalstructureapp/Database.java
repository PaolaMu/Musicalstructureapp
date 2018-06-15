package com.example.android.musicalstructureapp;

import java.util.ArrayList;

public class Database {
    public Database() {
        Artist justinBieber = new Artist("Justin Bieber", "Pop");

        Album purpose = new Album("Purpose", "2015");
        Album myWord = new Album("My Word 2.0", "2010");

        Song sorry = new Song("Sorry", "https://www.youtube.com/watch?v=fRh_vgS2dFE", "http://headlineplanet.com/home/wp-content/uploads/2015/10/Justin-Bieber-Sorry-Wide.jpg", purpose, justinBieber);
        songs.add(sorry);
        Song baby = new Song("Baby", "https://www.youtube.com/watch?v=kffacxfA7G4", "https://images.rapgenius.com/bd32ef2a22a800cb34168e48a276f18c.1000x1000x1.jpg", myWord, justinBieber);
        songs.add(baby);
        Song whatDoYouMean = new Song("What Do You Mean?", "https://www.youtube.com/watch?v=DK_0jXPuIr", "http://img.wennermedia.com/social/rs-207778-Screen-Shot-2015-08-31-at-9.21.17-AM.jpg", myWord, justinBieber);
        songs.add(whatDoYouMean);

        Artist tayloSwiff = new Artist("Taylor Swiff", "Pop");

        Album d1989 = new Album("1989", "2014");
        Album red = new Album("Red", "2012");

        Song shakeItOff = new Song("Shake It Off", "https://www.youtube.com/watch?v=nfWlot6h_JM", "http://ksassets.timeincuk.net/wp/uploads/sites/55/2018/02/taylor-swift-920x584.png", d1989, tayloSwiff);
        songs.add(shakeItOff);
        Song badBlood = new Song("Bad Blood", "https://www.youtube.com/watch?v=QcIy9NiNbmo", "https://assets.teenvogue.com/photos/561fa992e11c23f4543f772e/master/pass/1431962512_bad-blood-zoom.jpg", d1989, tayloSwiff);
        songs.add(badBlood);
        Song s22 = new Song("22", "https://www.youtube.com/watch?v=AgFeZr5ptV8", "http://americansongwriter.com/wp-content/uploads/2013/03/Taylor-Swift-22.jpg", red, tayloSwiff);
        songs.add(s22);

        Artist shakira = new Artist("Shakira", "Pop");

        Album vives = new Album("Vives", "2017");
        Album shakira1 = new Album("Shakira", "2014");
        Album elDorado = new Album("El Dorado", "2017");

        Song laBicicleta = new Song("La Bicicleta", "https://www.youtube.com/watch?v=-UV0QGLmYys", "http://www.eluniversal.com.mx/sites/default/files/2016/05/27/shakira_vives_bicicleta.jpg", vives, shakira);
        songs.add(laBicicleta);
        Song dare = new Song("Dare", "https://www.youtube.com/watch?v=XkYAxGt-aUs", "https://i.jeded.com/i/shakira-dare-la-la-la.24261.jpg", shakira1, shakira);
        songs.add(dare);
        Song meEnamore = new Song("Me enamoré", "https://www.youtube.com/watch?v=sPTn0QEhxds", "http://static.sportpaleisgroep.be/sportpaleis/img/events/1837/2fbcc34551516889ffef675b1200602f274f3492/billboard.jpg", elDorado, shakira);
        songs.add(meEnamore);

        Artist adele = new Artist("Adele", "Pop");

        Album d21 = new Album("21", "2011");
        Album d25 = new Album("25", "2015");

        Song someoneLikeYou = new Song("Someone Like You", "https://www.youtube.com/watch?v=hLQl3WQQoQ0", "https://images.genius.com/b0ea0d0107d6f8fd1c7d320e99f47897.1000x1000x1.png", d21, adele);
        songs.add(someoneLikeYou);
        Song rumorhasIt = new Song("Rumor Has It", "https://www.youtube.com/watch?v=-_6BBAVfzqM", "https://images.genius.com/b0ea0d0107d6f8fd1c7d320e99f47897.1000x1000x1.png", d21, adele);
        songs.add(rumorhasIt);
        Song hello = new Song("Hello", "https://www.youtube.com/watch?v=YQHsXMglC9A", "https://karacoustic.com/wp-content/uploads/2017/07/Adele-25-album.jpg", d25, adele);
        songs.add(hello);

        Artist pink = new Artist("Pink", "Pop");

        Album aliceThroughTheLookingGlass = new Album("Alice Through the Looking Glass", "2016");

        Song justLikeFire = new Song("Just Like Fire", "https://www.youtube.com/watch?v=5Nrv5teMc9Y", "http://cdn01.cdn.justjared.com/wp-content/uploads/headlines/2016/04/looking-glass.jpg", aliceThroughTheLookingGlass, pink);
        songs.add(justLikeFire);
        Artist edSheeran = new Artist("Ed Sheeran", "Pop");

        Album division = new Album("÷", "2017");
        Album multiply = new Album("x", "2014");

        Song shapeOfYou = new Song("Shape of You", "https://www.youtube.com/watch?v=JGwWNGJdvx8", "https://www.much.com/wp-content/uploads/2017/03/divide.jpg", division, edSheeran);
        songs.add(shapeOfYou);
        Song thinkingOutLoud = new Song("Thinking Out Loud", "https://www.youtube.com/watch?v=lp-EO5I60KA", "http://radioactivodj.com/wp-content/uploads/2015/01/ED-SHEERAN-THINKING-OUT-LOUD.jpg", multiply, edSheeran);
        songs.add(thinkingOutLoud);
        Song photograph = new Song("Photograph", "https://www.youtube.com/watch?v=nSDgHBxUbVQ", "http://lxrradio.gr/wp-content/uploads/2015/10/Ed-Sheeran-Thinking-Out-Loud1_1409584500_cover.jpg", multiply, edSheeran);
        songs.add(photograph);

        Artist katyPerry = new Artist("Katy Perry", "Pop");

        Album oneOfTheBoys = new Album("One Of The Boys", "2008");
        Album prism = new Album("Prism", "2013");

        Song hotNcold = new Song("Hot N Cold", "https://www.youtube.com/watch?v=kTHNpusq654", "https://www.katyperry.com/files/2017/03/hot-n-cold.jpg", oneOfTheBoys, katyPerry);
        songs.add(hotNcold);
        Song roar = new Song("Roar", "https://www.youtube.com/watch?v=CevxZvSJLk8", "https://www.billboard.com/files/styles/article_main_image/public/media/katy-perry-roar-video-650-430.jpg", prism, katyPerry);
        songs.add(roar);
    }

    private ArrayList<Song> songs = new ArrayList<>();

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
