package utilities;
import pojos.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteTxtUtil {
    public static void saveDataInFileWithAllCustomerInfo(String fileName, Customer[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));


            for (int i =0; i<customers.length;i++){

                writer.append(customers[i].getFirstName()+" , "+customers[i].getLastName()+"\n");
                if(customers[i].getUser() != null)
                    writer.append(customers[i].getUser().getFirstName());
                if(customers[i].getCountry() != null)
                    writer.append(customers[i].getCountry().getName());

            }

            writer.close();
        } catch(Exception e){

        }
    }
    public static void main(String[] args) {
        writeToFile("AllCustomerData.txt","Bekir Tufan");
    }
    public static void writeToFile(String filePath, String data){
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(data);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}