package cscd212classes.lab5.lifeform;

/**
 * Represents a Human which is a child of LifeForm.
 */
public class Human extends LifeForm
{

   /**
    * Constructs a Human by calling the super constructor.
    * @param name              the name of this Human.
    * @param currentLifePoints the currentLifePoints of this Human.
    */
   public Human(final String name, final int currentLifePoints)
   {
      super(name, currentLifePoints);
   }

}