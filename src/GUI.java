import javax.swing.*;
import java.awt.*;

public class GUI {

    public void startGUI(){

        MessageApp app = new MessageApp();
        JFrame window = new JFrame();
        JPanel panel = new JPanel();
        JTextArea displayTheQuote = new JTextArea(10, 20);
        JScrollPane scroller = new JScrollPane(displayTheQuote);
        JButton loveButton = new JButton("Love");
        JButton lifeButton = new JButton("Life");

        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        displayTheQuote.setText(app.selectRandomQuote(app.getTextFromFile()));
        displayTheQuote.setFont(new Font("Serif", Font.CENTER_BASELINE, 18));

        panel.add(scroller);
        //Split the line to the boundaries of the window
        displayTheQuote.setLineWrap(true);

        //don't split the words, keep them together.
        displayTheQuote.setWrapStyleWord(true);
        displayTheQuote.setEditable(false);

        window.getContentPane().add(BorderLayout.CENTER, panel);
        window.setSize(400, 400);
        window.setTitle("Quote of the moment!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }

}
