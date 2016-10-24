import java.io.*;

public class MessageApp {

    public String getTextFromFile() {

        FileReader reader = null;
        BufferedReader bReader = null;
        String allText = "";

        try {

            reader  = new FileReader("C:\\Users\\abautista\\Desktop\\PersonalThoughts.txt");
            bReader = new BufferedReader(reader);
            String line;

            while((line = bReader.readLine())!=null){
                allText += line + "\n";
            }
            return allText;

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
        return "";
    }
}

