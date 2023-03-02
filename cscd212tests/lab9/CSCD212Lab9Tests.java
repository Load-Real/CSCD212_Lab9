package cscd212tests.lab9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cscd212classes.lab9.factories.GameBoard;
import cscd212classes.lab9.factories.GameBoardFactory;
import cscd212classes.lab9.factories.LifeFormFactory;
import cscd212enums.lab9.BoardTheme;
import cscd212enums.lab9.DifficultyLevel;
import cscd212enums.lab9.LifeFormType;

public class CSCD212Lab9Tests
{
   @Test
   public void getGameBoardTestBeach()
   {
      assertTrue(GameBoardFactory.getGameBoard(BoardTheme.BEACH, DifficultyLevel.EASY).getClass()
            .getSimpleName().equalsIgnoreCase("BeachBoard"));
   }

   @Test
   public void getGameBoardTestMars()
   {
      assertTrue(GameBoardFactory.getGameBoard(BoardTheme.MARS, DifficultyLevel.EASY).getClass()
            .getSimpleName().equalsIgnoreCase("MarsBoard"));
   }

   @Test
   public void getGameBoardTestEarth()
   {
      assertTrue(GameBoardFactory.getGameBoard(BoardTheme.EARTH, DifficultyLevel.EASY).getClass()
            .getSimpleName().equalsIgnoreCase("EarthBoard"));
   }

   @Test
   public void getGameBoardTestEasy()
   {
      assertEquals(77, GameBoardFactory.getGameBoard(BoardTheme.EARTH, DifficultyLevel.EASY)
            .getEnemyLifeForms().get(0).getCurrentLifePoints());
   }

   @Test
   public void getGameBoardTestNormal()
   {
      assertEquals(110, GameBoardFactory.getGameBoard(BoardTheme.EARTH, DifficultyLevel.NORMAL)
            .getEnemyLifeForms().get(0).getCurrentLifePoints());
   }

   @Test
   public void getGameBoardTestHard()
   {
      assertEquals(165, GameBoardFactory.getGameBoard(BoardTheme.EARTH, DifficultyLevel.HARD)
            .getEnemyLifeForms().get(0).getCurrentLifePoints());
   }

   @Test
   public void getGameBoardTestInsane()
   {
      assertEquals(220, GameBoardFactory.getGameBoard(BoardTheme.EARTH, DifficultyLevel.INSANE)
            .getEnemyLifeForms().get(0).getCurrentLifePoints());
   }

   @Test
   public void getLifeFormMartian()
   {
      assertEquals("Martin", LifeFormFactory.getLifeForm(LifeFormType.MARTIAN).getName());
   }

   @Test
   public void getLifeFormHuman()
   {
      assertEquals("Hugh Mann", LifeFormFactory.getLifeForm(LifeFormType.HUMAN).getName());
   }

   @Test
   public void getLifeFormStarBellySneetch()
   {
      assertEquals("Starry",
            LifeFormFactory.getLifeForm(LifeFormType.STAR_BELLY_SNEETCH).getName());
   }

   @Test
   public void getLifeFormPlainBellySneetch()
   {
      assertEquals("Paul", LifeFormFactory.getLifeForm(LifeFormType.PLAIN_BELLY_SNEETCH).getName());
   }

   @Test
   public void getLifeFormMartianLP()
   {
      assertEquals(120, LifeFormFactory.getLifeForm(LifeFormType.MARTIAN).getCurrentLifePoints());
   }

   @Test
   public void getLifeFormHumanLP()
   {
      assertEquals(100, LifeFormFactory.getLifeForm(LifeFormType.HUMAN).getCurrentLifePoints());
   }

   @Test
   public void getLifeFormStarBellySneetchLP()
   {
      assertEquals(80,
            LifeFormFactory.getLifeForm(LifeFormType.STAR_BELLY_SNEETCH).getCurrentLifePoints());
   }

   @Test
   public void getLifeFormPlainBellySneetchLP()
   {
      assertEquals(70,
            LifeFormFactory.getLifeForm(LifeFormType.PLAIN_BELLY_SNEETCH).getCurrentLifePoints());
   }

}
