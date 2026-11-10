import java.util.Scanner;

public class LabFitnessTracker {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter workout type: ");
    String type = in.nextLine();

    System.out.print("Enter duration (in minutes): ");
    int duration = in.nextInt();
    
    System.out.print("Enter distance (in kilometers): ");
    double distance = in.nextDouble();

    RunningWorkout workout = new RunningWorkout(type, duration, distance);

    workout.showDetails();

    in.close();
  }
}

class Workout {
  String type;
  int duration; // in minutes

  Workout(String type, int duration) {
    this.type = type;
    this.duration = duration;
  }

  void showWorkout() {
    System.out.println("Workout Type: " + type);
    System.out.println("Duration: " + duration + " minutes");
  }
}

class RunningWorkout extends Workout {
  double distance; // in kilometers

  RunningWorkout(String type, int duration, double distance) {
    super(type, duration);
    this.distance = distance;
  }

  void showDetails() {
    showWorkout();
    System.out.println("Distance: " + distance + " km");
    System.out.println("Calories Burned: " + (distance * 60)); // Assuming 60 calories burned per km
  }
}