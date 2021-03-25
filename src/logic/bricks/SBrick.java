package logic.bricks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenlufeng
 * @date 2021/3/24
 */
public class SBrick implements Bricks{

    private final List<int[][]> brickMatrix = new ArrayList<>();

    public SBrick() {
        brickMatrix.add(new int[][]{
                {0,0,0,0},
                {0,5,5,0},
                {5,5,0,0},
                {0,0,0,0},
        });

        brickMatrix.add(new int[][]{
                {5,0,0,0},
                {5,5,0,0},
                {0,5,0,0},
                {0,0,0,0},
        });
    }

    @Override
    public List<int[][]> getShapeMatrix() {
        return null;
    }
}
