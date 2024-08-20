import java.io.*;
import java.util.Scanner;
import java.util.ArrayList; 
public class bottify
{
    public static void main(String[] args)
    {
        try
        {
                //fix file reader
        FileInputStream fis = new FileInputStream("botsongs.txt");
    Scanner sc = new Scanner(fis);

    


    while(sc.hasNextLine())
    {
        String str = sc.nextLine();
      //try giving music a definite length
        String[] music = str.split(",", 5);
        //fix array reading problem in if statement
        if(music[3].includes("R&B")){
            //combines the whole string back into one string and then adds it to an arraylist of its respective genre
            //arraylist.add(";");
            
        }else if(music[3].includes("Hip-hop")){
            System.out.println("Hip-hop: Impossible, Travis Scott, Hip-hop; 4 Your Eyez Only, J.Cole,  Hip-hop");
        }else if(music[3].includes("Rock")){
            System.out.println("Rock: Comfortably Numb, Pink Floyd, Rock");
        }else if(music[3].includes("Pop")){

        }
            //return arraylist of eaah genre Ex: Hip-hop + "/n" + Rock...etc
        }
    }
    sc.close();
}
catch(IOException e)
{
    e.printStackTrace();
}
}
