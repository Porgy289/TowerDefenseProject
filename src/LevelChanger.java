public class LevelChanger
{
    private int levelNumber;
    private LevelStarter currentLevel;

    public LevelChanger()
    {
        levelNumber = 1;
        currentLevel = getObject( levelNumber );
    }

    public int getLevelNumber()
    {
        return levelNumber;
    }


    public boolean nextLevel()
    {
        levelNumber++;
        currentLevel = getObject( levelNumber );
        return currentLevel == null;
    }

    public boolean currentLevelIsDone()
    {
        return currentLevel.isDone();
    }

    public Enemy tickCurrentLevel()
    {
        return currentLevel.tick();
    }

    static LevelStarter getObject( int levelNumber )
    {
        switch ( levelNumber )
        {
            case 1:
                return new LevelRepeater( 1, 30, 10 );
            case 2:
                return new LevelRepeater( 1, 30, 15 );
            case 3:
                return new LevelRepeater( 2, 30, 10 );
            case 4:
                return new LevelRepeater( 2, 25, 15 );
            case 5:
                return new LevelRepeater( 3, 30, 10 );
            case 6:
                return new LevelRepeater( 3, 20, 10 );
            case 7:
                return new LevelRepeater( 4, 20, 10 );
            case 8:
                return new LevelRepeater( 2, 15, 20 );
            case 9:
                return new LevelRepeater( 4, 10, 40 );
            case 10:
                return new LevelRepeater( 5, 10, 40 );
            case 11:
                return new LevelRepeater( 6, 10, 50 );
            case 12:
                return new LevelRepeater( 7, 10, 50 );
            case 13:
                return new LevelRepeater( 7, 2, 100 );
            default:
                return null;
        }
    }
}
