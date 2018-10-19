import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MessageApp {

    public List getTextFromFile() {

        FileReader reader = null;
        BufferedReader bReader = null;
        List<String> quote = new ArrayList<>();

        try {

            reader  = new FileReader("C:\\Users\\abautista\\Desktop\\PersonalThoughts.txt");
            bReader = new BufferedReader(reader);
            String line;

            while((line = bReader.readLine())!=null)
                quote.add(line);

            return quote;

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }catch(IOException e) {
            e.printStackTrace();

        }finally{
            if(bReader != null)
                try{
                    bReader.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
        }
        return quote;
    }

    public String selectRandomQuote(List<String> listQuote){

        Random randomizer = new Random();
        String random = listQuote.get(randomizer.nextInt(listQuote.size()));
        listQuote.remove(random);
        return random;

    }
}

