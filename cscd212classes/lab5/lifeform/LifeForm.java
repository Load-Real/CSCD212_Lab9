package cscd212classes.lab5.lifeform;

/**
 * The abstract LifeForm class represents a basic LifeForm.
 */
public abstract class LifeForm
{
   /**
    * The String representing this LifeForm's name.
    */
   private String name;
   /**
    * The int representing this LifeForm's current life points.
    */
   protected int currentLifePoints;

   /**
    * The constructor to create a LifeForm object which sets the name and currentLifePoints.
    * @param  name                     - this LifeForm's name
    * @param  currentLifePoints        - this LifeForm's current life points
    * @throws IllegalArgumentException - If name is null or empty or if currentLifePoints is <= 0
    */
   public LifeForm(final String name, final int currentLifePoints)
   {
      if (name == null || name.isEmpty() || currentLifePoints <= 0)
         throw new IllegalArgumentException("Bad Params in LifeForm Constructor");

      this.name = name;
      this.currentLifePoints = currentLifePoints;
   }

   /**
    * Returns this LifeForm's current life points.
    * @return int - this LifeForm's current life points
    */
   public int getCurrentLifePoints()
   {
      return this.currentLifePoints;
   }

   /**
    * Sets this LifeForm's currentLifePoints to the passed parameter.
    * @param currentLifePoints
    */
   public void setCurrentLifePoints(final int currentLifePoints)
   {
      this.currentLifePoints = currentLifePoints;
   }

   /**
    * Returns this LifeForm's name.
    * @return String - this LifeForm's name
    */
   public String getName()
   {
      return this.name;
   }

   /**
    * Returns a representation of the name and current life points as a String.
    * @return String in the format {name} + " has " + {currentLifePoints} + " life points"
    */
   @Override
   public String toString()
   {
      return this.name + " has " + this.currentLifePoints + " life points";
   }
}