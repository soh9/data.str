import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Replace "path_to_your_csv_file.csv" with the actual path to your CSV file
        String csvFile = "\"C:\\Users\\96655\\OneDrive - UMM AL-QURA UNIVERSITY\\Desktop\\DS project\\airlinedataset.csv\"";
        String line;
        String csvSplitBy = ","; // Assuming CSV columns are separated by commas

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip the header if it exists
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                // Assuming the order in CSV is: Gender, Customer Type, Age, Type of Travel, Class, Flight Distance
                String gender = data[0];
                String customerType = data[1];
                int age = Integer.parseInt(data[2]);
                String typeOfTravel = data[3];
                String flightClass = data[4];
                int flightDistance = Integer.parseInt(data[5]);

                // Insert data into the linked list
                linkedList.insert(gender, customerType, age, typeOfTravel, flightClass, flightDistance);
            }

            // Perform operations on the linked list here
            // Example:
            linkedList.traverse(); // To display the elements in the linked list
            linkedList.search(25); // To search for an age
            linkedList.delete(30); // To delete an element with a certain age
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
