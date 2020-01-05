public class Flight {
    String route;
    int fare;
    public Flight(String route, int fare) {
        this.route = route;
        this.fare = fare;
    }
    public String getRoute() { return route; }
    public int getFare() { return fare; }
    public void setRoute(String route) { this.route = route; }
    public void setFare(int fare) { this.fare = fare; }
    /*Complete the below function for second test case*/
    public String getDeparture() {
        String getDeparture[] = route.split("-");
        return getDeparture[0];
    }
    public String toString() {
        return this.route + " " + this.fare;
    }
   //add and complete your other methods here (if needed)

   
}
