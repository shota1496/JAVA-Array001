import java.util.*;


//LeetCode Array101
public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      
      // The actual code for creating an Array to hold DVD's.
      DVD[] dvdCollection = new DVD[15];
      
      // Firstly, we need to actually create a DVD object for The Avenger
      DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
      
      // Next, we'll put it into the 8th place of the Array.
      //Remenber, because we started numbering from 0, the index we want is 7.
      dvdCollection[7] = avengersDVD;
      
      DVD incrediblesDVD = new DVD("The incredibles", 2004, "Brand Bird");
      DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
      DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
      
      // Put "Rthe incredibles" into the 4 th place: index 3.
      dvdCollection[3] = incrediblesDVD;
      
      // Put "Finding Dory" into the 10th place: index 9.
      dvdCollection[9] = findingDoryDVD;
      
      // Put "The" Lion King into the 3rd place: index 2.
      dvdCollection[2] = lionKingDVD;
      
      //Notice that we put The Incredibles into the Array at index 3rd
      //The Incredibles no longer in the Array. It has been overwritten!
      DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
      dvdCollection[3] = starWarsDVD;
      
      // Print out what's in indexes 7, 10, and 3.
      System.out.println(dvdCollection[7]);
      System.out.println(dvdCollection[10]);
      System.out.println(dvdCollection[3]);
      
  }
  

}

// A simple Definition for a DVD.
public class DVD{
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