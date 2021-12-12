import java.util.List;

public class Director {
    DataReader reader = new DataReader();
    PyramidValidator validator = new PyramidValidator();
    Director(DataReader reader){
        this.reader = reader;
    }
}
