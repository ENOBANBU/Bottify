import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class bottify {
    public static void main(String[] args){
        //create hashmap for the songs that will be in it
        HashMap<String, String> songs = new HashMap<String, String>();
        //create scanner to scan the file
        Scanner myObj = new Scanner(System.in);
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
        blues.append("R&B");
        blues.append(": ");
        hip.append("Hip-hop");
        hip.append(": ");
        rock.append("Rock");
        rock.append(": ");
        pop.append("Pop");
        pop.append(": ");
        soul.append("Soul");
        soul.append(": ");
        //while loop to iterate through the text file
        while(myObj.hasNextLine()){
            //splits the input from the text file into the array
            //*ps* think its wrong but whatever */
             music.add(myObj.split(myObj.nextLine()));
            //adds the song name as the key and gere as the value to the hashmap
                songs.put(music[num], music[num + 2]);
            //id statements that check what genre the song is anad appends it to its correlating string builder
             if(songs.get(music[num + 2] == "R&B")){
                for(String x: music){
                    blues.append(x).append(", ");
                }
             }else if(songs.get(music[num + 2] == "Hip-hop")){
                for(String x: music){
                    hip.append(x).append(", ");
                }
             }else if(songs.get(music[num + 2] == "Rock")){
                for(String x: music){
                    rock.append(x).append(", ");
                }
             }else if(songs.get(music[num + 2] == "Pop")){
                for(String x: music){
                    pop.append(x).append(", ");
                }
             }else if(songs.get(music[num + 2] == "Soul")){
                for(String x: music){
                    soul.append(x).append(", ");
                }
             }
             //resets music array
             //resets hashmap
             music.length = 0;
             songs.length = 0;
                
             
        }
        //prints out each string
        system.out.println(hip + "/n" + rock + "/n" + blues + "/n" + pop + "/n" + soul);
    }
   

}
