package tuesdayCDExercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Catalog {

    private Map<String,CDTrays> mapOfTrays = new HashMap<String,CDTrays>();



    public CD searchByCDTitle(String title){
        for (Map.Entry<String, CDTrays> entry : mapOfTrays.entrySet()){
            for(int i = 0; i <= entry.getValue().getListOfCds().size() - 1; i++ ){
                if (entry.getValue().getListOfCds().get(i).getTitle().equals(title)){
                     return entry.getValue().getListOfCds().get(i);
                }
            }
        }
        return null ;
    }

    public CD searchByTrackName(String trackName){
        for (Map.Entry<String, CDTrays> entry : mapOfTrays.entrySet()){
            CDTrays tray = entry.getValue();
            for(int i = 0; i < tray.getListOfCds().size(); i++ ){
                CD cd = tray.getListOfCds().get(i);
                for(int j = 0; j < cd.getListOfTracks().size(); j++){
                    if (cd.getListOfTracks().get(j).getTrackName().equals(trackName)){
                         return cd;
                    }
                }
            }
        }
        return null;
    }

    public CD searchByArtist(String artist){

        for (Map.Entry<String, CDTrays> entry : mapOfTrays.entrySet()){
            for(int i = 0; i <= entry.getValue().getListOfCds().size() - 1; i++ ){
                if (entry.getValue().getListOfCds().get(i).getArtist().equals(artist)){
                    return entry.getValue().getListOfCds().get(i);
                }

            }

        }

        return null;
    }


    public Map<String,Integer> searchForLocationByTitle(String title){
        Map<String,Integer> searchForLocationByTitle = new HashMap<>();

        for (Map.Entry<String, CDTrays> entry : mapOfTrays.entrySet()){
            CDTrays tray = entry.getValue();
            for(int i = 0; i <= tray.getListOfCds().size() - 1; i++ )
                if (entry.getValue().getListOfCds().get(i).getTitle().equals(title)){
                    String trayLabel = entry.getValue().getLabel();
                    searchForLocationByTitle.put(trayLabel,i);
                }
        }
        return searchForLocationByTitle;

    }


    public Map<String,Integer> searchForLocationByTrackName(String trackName){
        Map<String,Integer> searchForLocationByTrackName = new HashMap<>();


        for (Map.Entry<String, CDTrays> entry : mapOfTrays.entrySet()){
            CDTrays tray = entry.getValue();
            for(int i = 0; i < tray.getListOfCds().size(); i++ ){
                CD cd = tray.getListOfCds().get(i);
                for(int j = 0; j < cd.getListOfTracks().size(); j++){
                    if (cd.getListOfTracks().get(j).getTrackName().equals(trackName)){
                        String trayLabel  = tray.getLabel();
                        searchForLocationByTrackName.put(trayLabel,i);
                    }
                }
            }
        }
        return searchForLocationByTrackName;
    }


    public Map<String,Integer> searchForLocationByArtist(String artist){
        Map<String,Integer> searchForLocationByArtist = new HashMap<>();


        for (Map.Entry<String, CDTrays> entry : mapOfTrays.entrySet()){
            for(int i = 0; i < entry.getValue().getListOfCds().size() ; i++ ){
                if (entry.getValue().getListOfCds().get(i).getArtist().equals(artist)){
                    String trayLabel = entry.getValue().getLabel();
                    searchForLocationByArtist.put(trayLabel,i);
                }
            }
        }
        return searchForLocationByArtist;
    }


    public void addTray(CDTrays tray){
        mapOfTrays.put(tray.getLabel(),tray);
    }


    public void addCDToCatalog(CD cd,String cdTrayLabel){

        for (Map.Entry<String, CDTrays> entry : mapOfTrays.entrySet()){
            if (entry.getValue().getLabel().equals(cdTrayLabel)){
                entry.getValue().addCD(cd);
            }
        }


    }



    public CD searchMultipleCDByCDTitle(String title1,String title2){
        for (Map.Entry<String, CDTrays> entry : mapOfTrays.entrySet()){
            for(int i = 0; i <= entry.getValue().getListOfCds().size() - 1; i++ ){
                if (entry.getValue().getListOfCds().get(i).getTitle().equals(title1)){
                    return entry.getValue().getListOfCds().get(i);
                }
                if (entry.getValue().getListOfCds().get(i).getTitle().equals(title2)){
                    return entry.getValue().getListOfCds().get(i);
                }
            }
        }
        return null ;
    }

    public void calculateTheLengthOfAllMusicOnATray(String trayLabel) {

         int totalLength = 0;





        for (Map.Entry<String, CDTrays> entry : mapOfTrays.entrySet()) {
            CDTrays tray = entry.getValue();
            if (tray.getLabel().equals(trayLabel)) {
                for (int i = 0; i < tray.getListOfCds().size(); i++) {
                    CD cd = tray.getListOfCds().get(i);
                    for (int j = 0; j < cd.getListOfTracks().size(); j++) {
                        totalLength += cd.getListOfTracks().get(j).getDurationInSeconds();
                    }
                }
            }else {
                System.out.println("Could not find label");
            }
        }


        int totalLengthInMinutes = totalLength / 60;
        int secondsRemaind = totalLength % 60;


        System.out.println("The total lenght of music's on the tray "+ trayLabel + " is "+ totalLengthInMinutes+ " minutes and " + secondsRemaind +" seconds.") ;
    }


    public HashSet findAllMatchingCDs(){


        HashSet unique = new HashSet();
        HashSet unique1 = new HashSet();

        for (Map.Entry<String, CDTrays> entry : mapOfTrays.entrySet()){
            CDTrays tray = entry.getValue();
            for (CD cd: tray.getListOfCds()){
                if(!unique.add(cd)){
                    unique1.add(cd);
            }
        }
                }


                return unique1;
    }


    public void printOutCDCover(CD cd){
        System.out.println("<" + cd.getArtist() + "> - <" + cd.getTitle() + "> \n Tracks: "  );


                for(int i = 0; i < cd.getListOfTracks().size(); i++){
                    String seconds = String.format("%02d", cd.getListOfTracks().get(i).getJustTheSeconds());// "%02d" is for padding with 1 Zero(0)
                    String minute = String.format("%01d", cd.getListOfTracks().get(i).getJustTheMinutes());
                    int e = i+1;
                    System.out.printf("<" + e + "> - <" + cd.getListOfTracks().get(i).getTrackName() + "> - <duration " + minute + ":" + seconds + ">\n" );
                }
            }





}
