package logic.bricks;

import java.util.ArrayList;
import java.util.List;

public class JBrick {
    private final List<int[][]> brickMatrix = new ArrayList<>();

    public JBrick() {
        brickMatrix.add(new int[][]{
                {0,0,0,0},
                {2,2,2,0},
                {0,0,2,0},
                {0,0,0,0},

        });
        brickMatrix.add(new int[][]{
                {0,0,0,0},
                {0,2,2,0},
                {0,2,0,0},
                {0,2,0,0},

        });

        brickMatrix.add(new int[][]{
                {0,0,0,0},
                {0,2,0,0},
                {0,2,2,2},
                {0,0,0,0},
        });

        brickMatrix.add(new int[][]{
                {0,0,2,0},
                {0,0,2,0},
                {0,2,2,0},
                {0,0,0,0},
        });
    }

    public List<int[][]> getBrickMatrix() {
        return brickMatrix;
    }
}
