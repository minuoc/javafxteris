package gui;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import logic.bricks.OBrick;


public class GuiController {

    private static final int BRICK_SIZE = 20;

    @FXML
    private GridPane gamePanel;

    @FXML
    private GridPane brickPanel;

    public void initGameView(OBrick brick){
        for(int i = 2; i < 25; i++){
            for (int j = 0; j < 10; j++){
                Rectangle rectangle = new Rectangle(BRICK_SIZE, BRICK_SIZE);
                rectangle.setFill(Color.TRANSPARENT);
                gamePanel.add(rectangle,j, i - 2);
            }
        }

        int[][] currentShape = brick.getBrickMatrix().get(0);

        for (int i = 0; i < currentShape.length; i++){
            for (int j = 0; j < currentShape[i].length; j++){
                Rectangle rectangle = new Rectangle(BRICK_SIZE,BRICK_SIZE);
                rectangle.setFill(getFillColor(currentShape[i][j]));
                brickPanel.add(rectangle,j,i);
            }
        }
    }

    public Paint getFillColor(int i) {
        Paint returnPaint;
        switch (i) {
            case 0:
                returnPaint = Color.TRANSPARENT;
                break;
            case 1:
                returnPaint = Color.AQUA;
                break;
            default:
                returnPaint = Color.WHITE;
                break;
        }
        return returnPaint;
    }
}
