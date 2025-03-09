import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        int rowCount = 21, columnCount = 19, tileSize = 32;
        int boardWidth = columnCount * tileSize, boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac-Man");

        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack(); // Adjust frame size based on JPanel size
        pacmanGame.requestFocus();
        frame.setVisible(true);
        
    }
}
