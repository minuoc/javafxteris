package logic.bricks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenlufeng
 * @date 2021/3/25
 */
public class ZBrick implements Bricks{

    private final List<int[][]> brickMatrix = new ArrayList<>();

    public ZBrick() {
        brickMatrix.add(new int[][]{
                {0,0,0,0},
                {7,7,0,0},
                {0,7,7,0},
                {0,0,0,0},
        });

        brickMatrix.add(new int[][]{
                {0,7,0,0},
                {7,7,0,0},
                {7,0,0,0},
                {0,0,0,0},
        });
    }

    @Override
    public List<int[][]> getShapeMatrix() {
        return brickMatrix;
    }
}
