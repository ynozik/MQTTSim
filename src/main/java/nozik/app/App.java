import com.mongodb.*;

public class App {
  public static void main(String[] args) {
    try {
      MongoClient mongo = new MongoClient("localhost", 27017);
    }
    catch (Exception e) {

    }

  }
}