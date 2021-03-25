package logic.bricks;

import java.util.ArrayList;
import java.util.List;


public final class OBrick {

    private final List<int[][]> brickMatrix = new ArrayList<>();

    public OBrick() {
        brickMatrix.add(new int[][]{
                {0,0,0,0},
                {0,4,4,0},
                {0,4,4,0},
                {0,0,0,0},

        });
    }

    public List<int[][]> getBrickMatrix() {
        return brickMatrix;
    }
}
