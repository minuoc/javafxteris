package logic.bricks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenlufeng
 * @date 2021/3/25
 */
public class TBrick implements Bricks{

    private final List<int[][]> brickMatrix = new ArrayList<>();

    public TBrick() {
        brickMatrix.add(new int[][]{
                {0,0,0,0},
                {6,6,6,0},
                {0,6,0,0},
                {0,0,0,0},
        });

        brickMatrix.add(new int[][]{
                {0,6,0,0},
                {0,6,6,0},
                {0,6,0,0},
                {0,0,0,0},
        });

        brickMatrix.add(new int[][]{
                {0,6,0,0},
                {6,6,6,0},
                {0,0,0,0},
                {0,0,0,0},
        });

        brickMatrix.add(new int[][]{
                {0,6,0,0},
                {6,6,0,0},
                {0,6,0,0},
                {0,0,0,0},
        });

    }

    @Override
    public List<int[][]> getShapeMatrix() {
        return brickMatrix;
    }
}
