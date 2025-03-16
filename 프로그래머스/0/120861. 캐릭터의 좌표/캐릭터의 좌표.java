class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        MyGame mg = new MyGame(board);
        
        for (String key : keyinput) {
            if ("right".equals(key)) {
                mg.moveRight();
            } else if ("left".equals(key)) {
                mg.moveLeft();
            } else if ("up".equals(key)) {
                mg.moveUp();
            } else if ("down".equals(key)) {
                mg.moveDown();
            }
        }
        
        return mg.getCurCoordinate();
    }
    
}

class MyGame {
    private int x;
    private int y;
    private int maxX;
    private int maxY;
    
    public MyGame (int[] board) {
        this.maxX = board[0] / 2;
        this.maxY = board[1] / 2;
    }
    
    public void moveUp () {
        if (y + 1 > maxY) {
            return ;
        }
        y++;
    }
    
    public void moveDown () {
        if ((y - 1) * -1 > maxY) {
            return;
        }
        y--;
    }
    
    public void moveRight() {
        if (x + 1 > maxX) {
            return;
        }
        x++;
    }
    
    public void moveLeft() {
        if ((x - 1) * -1 > maxX) {
            return;
        }
        x--;
    }
    
    public int[] getCurCoordinate () {
        return new int[]{x, y};
    }
}