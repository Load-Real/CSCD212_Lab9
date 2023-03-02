package cscd212classes.lab5.lifeform;

/**
 * Represents a Maartian which is a child of LifeForm.
 */
public class Martian extends LifeForm
{

   /**
    * Constructs a Martian by calling the super constructor.
    * @param name              the name of this Martian.
    * @param currentLifePoints the currentLifePoints of this Martian.
    */
   public Martian(final String name, final int currentLifePoints)
   {
      super(name, currentLifePoints);
   }

}