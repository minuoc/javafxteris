package gui;

import logic.bricks.OBrick;

public class GameController {

    private final GuiController viewController;

    private OBrick brick;

    public GameController(GuiController c) {
        brick = new OBrick();
        this.viewController = c;
        this.viewController.initGameView(brick);
    }


}
