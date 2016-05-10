package nozik;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.net.UnknownHostException;

import com.mongodb.*;

public class App {
  public static void main(String[] args) {
    System.out.println("Beginning connection to local database");
    MongoClient mongo = new MongoClient("localhost", 27017);

    System.out.println("Get the database");
    MongoDatabase database = mongo.getDatabase("test");

    System.out.println("Get the collection");
    MongoCollection<Document> collection = database.getCollection("collec");

    System.out.println("Collection has " + collection.count() + " documents");

    System.out.println("Close the client");
    mongo.close();
    System.out.println("Done");
  }
}