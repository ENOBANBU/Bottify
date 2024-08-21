import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException; 

public class bottify {
    public static void main(String[] args){
        //create hashmap for the songs that will be in it
        HashMap<String, String> songs = new HashMap<String, String>();
        //create scanner to scan the file
        File reader = new File("/botsongs.txt");
        Scanner myObj = new Scanner(reader);
        //string builders to build the out put
        StringBuilder blues = new StringBuilder();
        StringBuilder hip = new StringBuilder();
        StringBuilder rock = new StringBuilder();
        StringBuilder pop = new StringBuilder();
        StringBuilder soul = new StringBuilder();
        int num = 0;
        //temp array for songs when split into 3 parts - song name, artst, gerne
        String[] music;
        //add first parts to each string i need for output
        blues.append("R&B: ");
        hip.append("Hip-hop: ");
        rock.append("Rock: ");
        pop.append("Pop: ");
        soul.append("Soul: ");
        //while loop to iterate through the text file
        while(myObj.hasNextLine()){
            //splits the input from the text file into the array
            //*ps* think its wrong but whatever */
             music = myObj.nextLine().split(",");
            //adds the song name as the key and gere as the value to the hashmap
            songs.put(music[0], music[2]);
            //id statements that check what genre the song is anad appends it to its correlating string builder
             if(songs.get(music[2]) == "R&B" ){
                for(String x: music){
                    blues.append(x).append(", ");
                }
             }else if(songs.get(music[2]) == "Hip-hop"){
                for(String x: music){
                    hip.append(x).append(", ");
                }
             }else if(songs.get(music[2]) == "Rock"){
                for(String x: music){
                    rock.append(x).append(", ");
                }
             }else if(songs.get(music[2]) == "Pop"){
                for(String x: music){
                    pop.append(x).append(", ");
                }
             }else if(songs.get(music[2]) == "Soul"){
                for(String x: music){
                    soul.append(x).append(", ");
                }
             }

             //resets hashmap
             songs.clear();      
             
        }
        //prints out each string
        System.out.println(hip + "/n" + rock + "/n" + blues + "/n" + pop + "/n" + soul);
    }
   
}
