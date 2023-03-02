package cscd212lab9;

import java.util.Scanner;

import cscd212classes.lab5.lifeform.LifeForm;
import cscd212classes.lab9.factories.GameBoard;
import cscd212classes.lab9.factories.GameBoardFactory;
import cscd212enums.lab9.*;

public class CSCD212Lab9
{

   public static void main(String[] args)
   {

      GameBoard board;

      System.out.println("Choose a Difficulty Level");

      BoardTheme boardChoice = getBoardTheme();
      DifficultyLevel difficultyLevel = getDifficultyLevel();
      board = GameBoardFactory.getGameBoard(boardChoice, difficultyLevel);

      playGame(board);

   }

   private static void playGame(final GameBoard board)
   {
      LifeForm player = board.getPlayer();

      System.out.println("Player " + player);

      for (LifeForm lf : board.getEnemyLifeForms())
         System.out.println("Enemy " + lf);

   }

   private static BoardTheme getBoardTheme()
   {
      while (true)
      {
         System.out.println("Choose a Board Theme (or type Q to quit)");

         for (BoardTheme b : BoardTheme.values())
            System.out.print("- " + b.name().toLowerCase() + "\n");

         Scanner kb = new Scanner(System.in);
         String userChoice = kb.nextLine();

         if (userChoice.equalsIgnoreCase("q"))
            System.exit(1);

         BoardTheme[] array = BoardTheme.values();

         for (int x = 0; x < array.length; x++)
            if (array[x].name().equalsIgnoreCase(userChoice))
               return array[x];

         System.out.println("No Board Theme Matches the String " + userChoice);
      }
   }

   private static DifficultyLevel getDifficultyLevel()
   {
      while (true)
      {
         System.out.print("Choose a Difficulty Level (or type Q to quit)\n");

         for (DifficultyLevel b : DifficultyLevel.values())
            System.out.print("- " + b.name().toLowerCase() + "\n");

         Scanner kb = new Scanner(System.in);
         String userChoice = kb.nextLine().trim();

         if (userChoice.equalsIgnoreCase("q"))
            System.exit(1);

         DifficultyLevel[] array = DifficultyLevel.values();

         for (int x = 0; x < array.length; x++)
            if (array[x].name().equalsIgnoreCase(userChoice))
            {
               kb.close();
               return array[x];
            }
         System.out.println("No Difficulty Level Matches the String " + userChoice);
      }
   }

}
