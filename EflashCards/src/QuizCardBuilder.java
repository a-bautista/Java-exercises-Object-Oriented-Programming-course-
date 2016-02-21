import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;

public class QuizCardBuilder extends JFrame {

    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;

      public static void main(String [] args){
          QuizCardBuilder builder = new QuizCardBuilder();
          builder.go();
      }

   public void go(){
       frame = new JFrame("Quiz Card Builder");
       JPanel mainPanel = new JPanel();
       Font bigFont = new Font("sanserif",Font.BOLD,24);
       question = new JTextArea(10,20);
       question.setLineWrap(true);
       question.setWrapStyleWord(true);
       question.setFont(bigFont);

       JScrollPane qScroller = new JScrollPane(question);
       qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

       answer = new JTextArea();
       answer.setLineWrap(true);
       answer.setWrapStyleWord(true);
       answer.setFont(bigFont);

       JScrollPane aScroller = new JScrollPane(answer);
       aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
       aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

       JButton nextButton = new JButton("Next Card");

       cardList = new ArrayList<QuizCard>();

       JLabel qLabel = new JLabel("Question: ");
       JLabel aLabel = new JLabel("Answer: ");

       mainPanel.add(qLabel);
       mainPanel.add(qScroller);
       mainPanel.add(aLabel);
       mainPanel.add(aScroller);
       mainPanel.add(nextButton);

       nextButton.addActionListener(new NextCardListener());
       JMenuBar menuBar = new JMenuBar();//JMenuItem goes into JMenu and JMenu goes into JMenuBar
       JMenu fileMenu = new JMenu("File");
       JMenuItem newMenuItem = new JMenuItem("New");
       JMenuItem saveMenuItem = new JMenuItem("Save");
       newMenuItem.addActionListener(new NewMenuListener());

       saveMenuItem.addActionListener(new SaveMenuListener());
       fileMenu.add(newMenuItem);
       fileMenu.add(saveMenuItem);
       menuBar.add(fileMenu);
       frame.setJMenuBar(menuBar);
       
       frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
       frame.setSize(500,600);
       frame.setVisible(true);

       setDefaultCloseOperation(EXIT_ON_CLOSE);//You MUST include extends JFrame
   }

   public class NextCardListener implements ActionListener{ //inner class
       public void actionPerformed(ActionEvent e){

           QuizCard card = new QuizCard(question.getText(),answer.getText());
           cardList.add(card);
           clearCard();

       }
   }

   public class SaveMenuListener implements ActionListener{//inner class
       public void actionPerformed(ActionEvent e){
           QuizCard card = new QuizCard(question.getText(),answer.getText());
           cardList.add(card);

           JFileChooser fileSave = new JFileChooser();
           fileSave.showSaveDialog(frame);
           saveFile(fileSave.getSelectedFile());

       }
   }

  public class NewMenuListener implements ActionListener{//inner class
      public void actionPerformed(ActionEvent e){
          cardList.clear();
          clearCard();
      }
  }

  private void clearCard(){
      question.setText("");
      answer.setText("");
      question.requestFocus();
  }

  private void saveFile(File file){
      try{
          BufferedWriter writer = new BufferedWriter(new FileWriter(file)); // a buffer acts like a shopping cart
          for (QuizCard card:cardList) {
              writer.write(card.getQuestion()+"/n"); //You walk through the ArrayList of cards
              writer.write(card.getAnswer()+"/n");   // and write them out, one card per line with
                                                     //question and answer. card is a variable of type QuizCard
              
          }
          writer.close();
      }catch(IOException ex){
          System.out.println("Couldn't write the cardList out");
          ex.printStackTrace();

      }
  }
}
