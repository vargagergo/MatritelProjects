package tuesdayCDExercise;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Catalog songs = new Catalog();   //CATALOG


        CDTrays rock = new CDTrays("rock");      //CD-TRAY




        CD ramstein = new CD("DuHast","Ramstein", LocalDate.of(2003,12,30));
        CD pink = new CD("The Wall","PinkFloyd", LocalDate.of(2002,11,6));
        CD pj = new CD("Ten", "Pearl Jam", LocalDate.of(2005,2,12));
        CD nirvana = new CD("In utero", "Nirvana", LocalDate.of(2014,4,5));


        Track heyYou = new Track("Hey You",543 );
        Track heyYou1 = new Track("Hey You1",456 );
        Track heyYou2 = new Track("Hey You2",176 );
        Track heyYou3 = new Track("Hey You3",200 );
        Track heyYou4 = new Track("Hey You4",221 );
        Track heyYou5 = new Track("Hey You5",320 );



        rock.addCD(nirvana);


        songs.addTray(rock);

        pink.addTrackToCD(heyYou);
        pink.addTrackToCD(heyYou1);
        pink.addTrackToCD(heyYou2);
        pink.addTrackToCD(heyYou3);
        pink.addTrackToCD(heyYou4);
        pink.addTrackToCD(heyYou5);

        rock.addCD(pink);
        rock.addCD(pj);





//        songs.addCDToCatalog(ramstein,"rock");




        pj.addTrackToCD(new Track("Jeremy", 120));
        pj.addTrackToCD(new Track("Release", 120));
        nirvana.addTrackToCD(new Track("Rape me", 120));
        nirvana.addTrackToCD(new Track("Come as you are", 120));



//
//        System.out.println(songs.searchForLocationByArtist("PinkFloyd"));
//        System.out.println(songs.searchByArtist("Pearl Jam"));
//        System.out.println(songs.searchForLocationByTitle("DuHast"));
//        System.out.println(songs.searchByCDTitle("In utero"));
//
//
//        System.out.println(songs.searchForLocationByTrackName("Rape me"));
//
//
//        System.out.println(songs.searchByTrackName("Come as you are"));
//        System.out.println(songs.searchByTrackName("Hey You"));


        songs.calculateTheLengthOfAllMusicOnATray("rock");
        System.out.println(songs.findAllMatchingCDs());

        songs.printOutCDCover(pink);
    }
}
