class InvalidSpeedException extends Exception {

  public InvalidSpeedException(String message){
     super(message);
  }

}

class Vehicle {
    private int speed = 0;
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
           throw new InvalidSpeedException("TOO HIGH");

        }else{
            speed += increment;
        }
    }

    public void speedDown(int decrement)
    {
        if(speed - decrement < 0){
            // throw exception
           throw new IllegalArgumentException("Final speed can not be less than zero");
        }else{
            speed -= decrement;
        }
    }
}

