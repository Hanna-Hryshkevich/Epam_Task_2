import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class DataReader {
    public DataReader(){
    }
    public List<String> read(String path) throws IOException {
        List<String> result = new ArrayList<>();
        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            String tmp;
            while ((tmp = bufferedReader.readLine()) != null){
                result.add(tmp);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An IO exception occurred");
        }
        return result;
    }
}
