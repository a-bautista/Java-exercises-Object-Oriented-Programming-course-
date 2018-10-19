import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {


    MessageApp app = new MessageApp();
    JFrame window = new JFrame();
    JPanel panel = new JPanel();
    JTextArea displayTheQuote = new JTextArea(10, 20);
    JScrollPane scroller = new JScrollPane(displayTheQuote);
    JButton button = new JButton("Next quote");


    public void startGUI() {

        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        displayTheQuote.setText(app.selectRandomQuote(app.getTextFromFile()));
        displayTheQuote.setFont(new Font("Serif", Font.CENTER_BASELINE, 18));

        panel.add(scroller);
        panel.add(button);

        button.addActionListener(this);
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

    public void actionPerformed(ActionEvent event){

        displayTheQuote.setText(app.selectRandomQuote(app.getTextFromFile()));
        displayTheQuote.setFont(new Font("Serif", Font.CENTER_BASELINE, 18));
    }
    
}








