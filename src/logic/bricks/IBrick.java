package logic.bricks;

import java.util.ArrayList;
import java.util.List;

public class IBrick {
    private final List<int[][]> brickMatrix = new ArrayList<>();

    public IBrick() {
        brickMatrix.add(new int[][]{
                {0,0,0,0},
                {1,1,1,1},
                {0,0,0,0},
                {0,0,0,0},

        });
        brickMatrix.add(new int[][]{
                {0,1,0,0},
                {0,1,0,0},
                {0,1,0,0},
                {0,1,0,0},

        });
    }

    public List<int[][]> getBrickMatrix() {
        return brickMatrix;
    }
}
