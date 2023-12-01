package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {
    SnakeGame() {                   // constructor
        super("Snake Game");   //super must be the first statement inside the constructor
        add(new Board());
        pack();                     //it refresh the function so changes can reflect

        setLocationRelativeTo(null); //to open at center
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);  //new obj
    }
}