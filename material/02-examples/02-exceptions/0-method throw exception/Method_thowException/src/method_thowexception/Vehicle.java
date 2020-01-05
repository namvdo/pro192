package method_thowexception;

class InvalidSpeedException extends Exception {

  public InvalidSpeedException(String message){
     super(message);
  }

}

class Vehicle {
    private int speed = 22;
    private int maxSpeed = 100;

    public int getSpeed()
    {
        return speed;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void speedUp(int increment) throws InvalidSpeedException
    {
        if(speed + increment > maxSpeed){
            // throw exception
           throw new InvalidSpeedException("TOO HIGH1");

        }else{
            speed += increment;
        }
    }
    
    public void speedDown(int decrement) throws IllegalArgumentException
    {
        if(speed - decrement < 0){
            // throw exception
           throw new IllegalArgumentException("Final speed can not be less than zero2");
        }else{
            speed -= decrement;
        }
    }
}

