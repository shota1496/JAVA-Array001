// A simple Definition for a DVD.
public class DVD {

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass1 instance1 = new NewClass1();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance1.sayHelloFromNewClass());
  
  /*
  public String sayHelloFromNewClass(){
    return "Hello from New Class 1";
  }*/
  
  public String name;
  public int releaseYear;
  public String director;
  
  public DVD(String name, int releaseYear, String director){
    this.name = name;
    this.releaseYear = releaseYear;
    this.director = director;
  }
  
  public String toString(){
    return this.name + ", directored by " + this.director + ", released in " + this.releaseYear;
  }
}