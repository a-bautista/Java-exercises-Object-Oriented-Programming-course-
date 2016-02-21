import java.io.*;

public class Files implements Serializable{

    private int width;
    private int height;

    public void setHeight(int height){
        this.height=height;
    }

    public void setWidth(int width){
        this.width=width;
    }

      
    public static void main(String args[]){
        Files nuevo= new Files();
        nuevo.setHeight(40);
        nuevo.setWidth(30);
    try{
        FileOutputStream  file = new FileOutputStream("MyGame.ser"); //Make a FileOutputStream file and save it in the folder's project SavingObjects
    //A fileOutputStream knows how to connect and create a file.

        ObjectOutputStream os = new ObjectOutputStream(file); //this part writes on the objects.
        os.writeObject(nuevo);

        os.close();

   }catch(Exception ex){
       ex.printStackTrace();
   }

 }
}